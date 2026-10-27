package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Comun.clsEncriptacion;
import com.cdi.com.Agroapoya2CDI.Entity.Ikon_sp_InsertarEnvioCorreosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.RemitenteCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Services.Ikon_sp_InsertarEnvioCorreosService;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.Date;
import java.util.List;
import java.util.Properties;

@Service
public class Ikon_sp_InsertarEnvioCorreosServiceImplementacion implements Ikon_sp_InsertarEnvioCorreosService {

    @PersistenceContext
    private EntityManager repositorio;

    private static final String CLAVE_AUTORIZADA = "4gr04p0y42";

    @Override
    public String IkonEnvioCorreoIndividual(Ikon_sp_InsertarEnvioCorreosEntity entidad) {
        // 1. Validación de la clave de autorización
        if (entidad.getClave() == null || !CLAVE_AUTORIZADA.equals(entidad.getClave().trim())) {
            return JSONObject.quote("ERROR: Clave de autorización no válida. No se permite el envío.");
        }

        try {
            // 2. Ejecutar Stored Procedure de inserción
            StoredProcedureQuery sp = repositorio.createStoredProcedureQuery("sp_InsertarEnvioCorreos_IKON");

            sp.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);  // @Descripcion
            sp.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);  // @CorreoPrincipal
            sp.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);  // @CorreoCopia
            sp.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);  // @Asunto
            sp.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);  // @Cuerpo
            sp.registerStoredProcedureParameter(6, Date.class, ParameterMode.IN);    // @FechaEnvio
            sp.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT); // @Respuesta

            sp.setParameter(1, entidad.getDescripcion());
            sp.setParameter(2, entidad.getCorreoPrincipal());
            sp.setParameter(3, entidad.getCorreoCopia());
            sp.setParameter(4, entidad.getAsunto());
            sp.setParameter(5, entidad.getCuerpo());
            sp.setParameter(6, new Date());

            sp.execute();

            Object objRespuesta = sp.getOutputParameterValue(7);
            String respuestaSp = objRespuesta != null ? objRespuesta.toString() : "OK";

            // 3. Despachar correo electrónico por SMTP
            enviarCorreoSmtp(
                    entidad.getCorreoPrincipal(),
                    entidad.getCorreoCopia(),
                    entidad.getAsunto(),
                    entidad.getCuerpo()
            );

            return JSONObject.quote("Correo enviado correctamente. Respuesta: " + respuestaSp);

        } catch (Exception e) {
            e.printStackTrace();
            return JSONObject.quote("ERROR LOG (sp_InsertarEnvioCorreos_IKON): " + e.getMessage());
        }
    }

    private void enviarCorreoSmtp(String destinatario, String copia, String asunto, String cuerpoHtml) throws Exception {
        StoredProcedureQuery remitenteQuery = repositorio.createNamedStoredProcedureQuery("paC_RemitenteCorreo");
        List<RemitenteCorreoEntity> remite = remitenteQuery.getResultList();

        if (remite == null || remite.isEmpty()) {
            throw new IllegalStateException("No se encontraron datos de configuración del remitente.");
        }

        RemitenteCorreoEntity configRemitente = remite.get(0);
        String correoremitente = configRemitente.getCorreoRemitente();
        String servicePath = configRemitente.getServicePath();
        String contrasena = clsEncriptacion.Desencriptar(configRemitente.getClave());

        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.smtp.host", servicePath);
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.starttls.required", "true");
        props.setProperty("mail.smtp.ssl.trust", servicePath);
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props);
        session.setDebug(false);

        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(correoremitente));

        if (destinatario != null && !destinatario.trim().isEmpty()) {
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario.trim()));
        }

        if (copia != null && !copia.trim().isEmpty()) {
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(copia.trim()));
        }

        message.setSubject(asunto != null ? asunto : "", "UTF-8");

        MimeMultipart multipart = new MimeMultipart("related");
        MimeBodyPart htmlBody = new MimeBodyPart();
        htmlBody.setContent(cuerpoHtml != null ? cuerpoHtml : "", "text/html; charset=UTF-8");
        multipart.addBodyPart(htmlBody);

        message.setContent(multipart);
        message.saveChanges();

        try (Transport ts = session.getTransport()) {
            ts.connect(servicePath, correoremitente, contrasena);
            ts.sendMessage(message, message.getAllRecipients());
        }
    }
}