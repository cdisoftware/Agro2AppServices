package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Comun.clsEncriptacion;
import com.cdi.com.Agroapoya2CDI.Entity.CEnvioRealCorreo_ConsultaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.DocuEnvioCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.RemitenteCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CEnvioRealCorreoService;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class EnvioCorreoMasivoServiceImplementacion implements CEnvioRealCorreoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private TemplateEngine templateEngine;

    Integer codigoproceso;
    String Respuesta;
    String asunto;
    String destinatario;
    String contenido;
    String imagenencabezado;
    String imagenpiepagina;

    @Override
    public String ConsultaEnvioRealCorreo(Integer bandera, Integer IdPlantilla, Integer IdTipoUsuario, Integer cd_cnctvo, Integer IdSector) {

        Map<String, Object> mapMessage = new HashMap<>();

        StoredProcedureQuery insertCD = repositorio.createNamedStoredProcedureQuery("paCEnvioRealCorreo");
        insertCD.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
        insertCD.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
        insertCD.registerStoredProcedureParameter("IdTipoUsuario", Integer.class, ParameterMode.IN);
        insertCD.registerStoredProcedureParameter("cd_cnctvo", Integer.class, ParameterMode.IN);
        insertCD.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

        insertCD.setParameter("bandera", bandera);
        insertCD.setParameter("IdPlantilla", IdPlantilla);
        insertCD.setParameter("IdTipoUsuario", IdTipoUsuario);
        insertCD.setParameter("cd_cnctvo", cd_cnctvo);
        insertCD.setParameter("IdSector", IdSector);

        insertCD.execute();
        Integer respu = (Integer) insertCD.getOutputParameterValue("Respuesta");
        //System.out.println(respu + "Codigo generado");
        try {
            Context context = new Context();
            StoredProcedureQuery cuerpo = repositorio.createNamedStoredProcedureQuery("paCEnvioRealCorreo_Consulta");
            cuerpo.registerStoredProcedureParameter("CodigoProceso", Integer.class, ParameterMode.IN);

            cuerpo.setParameter("CodigoProceso", respu);
            cuerpo.getResultList();
            List<CEnvioRealCorreo_ConsultaEntity> cuerpocorreo = cuerpo.getResultList();

            String correoremitente = null;
            String servicePath = null;
            String contrasena = null;
            //**************************CORREO REMITENTE*********************************
            StoredProcedureQuery remitente = repositorio.createNamedStoredProcedureQuery("paC_RemitenteCorreo");
            remitente.getResultList();
            List<RemitenteCorreoEntity> remite = remitente.getResultList();

            correoremitente = remite.get(0).getCorreoRemitente();
            servicePath = remite.get(0).getServicePath();
            contrasena = clsEncriptacion.Desencriptar(remite.get(0).getClave());

            Properties props = new Properties();
            props.setProperty("mail.transport.protocol", "smtp"); // usa el protocolo pop3
            props.setProperty("mail.host", servicePath); // servidor pop3
            props.setProperty("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            // Crear objeto de instancia de sesión
            Session session = Session.getInstance(props);
            session.setDebug(true);
            Transport ts = session.getTransport();
            ts.connect(servicePath, correoremitente, contrasena);

            String[] rem = new String[cuerpocorreo.size()];
            for (int i = 0; i < cuerpocorreo.size(); i++) {
                IdPlantilla = cuerpocorreo.get(i).getIdPlantilla();
                imagenencabezado = rem[i] = cuerpocorreo.get(i).getImagenEnc();
                asunto = rem[i] = cuerpocorreo.get(i).getAsunto();
                destinatario = rem[i] = cuerpocorreo.get(i).getEmail();
                contenido = rem[i] = cuerpocorreo.get(i).getHtml();
                imagenpiepagina = rem[i] = cuerpocorreo.get(i).getImagenPie();
                context.setVariable("imagenencabezado", imagenencabezado);
                context.setVariable("destinatario", destinatario);
                context.setVariable("asunto", asunto);
                context.setVariable("contenido", contenido);
                context.setVariable("imagenpiepagina", imagenpiepagina);

                String content = templateEngine.process("EnvioCorreos", context);
                mapMessage.put("subject", asunto);
                mapMessage.put("content", content);
                //sendMessage(mapMessage, bandera, IdPlantilla);

                // Crear correo electrónico
                Message message = createMixedMail(session, mapMessage, correoremitente, bandera, IdPlantilla);
                //enviar correo electrónico 
                ts.sendMessage(message, message.getAllRecipients());

            }
            ts.close();
            Respuesta = JSONObject.quote("Correo Enviado Correctamente");
        } catch (Exception e) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia || paCEnvioRealCorreo_Consulta");
        }
        return Respuesta;
    }

    public MimeMessage createMixedMail(Session session, Map<String, Object> mapMessage, String correoremitente,
            Integer Bandera, Integer IdPlantilla) throws Exception {

        MimeMessage message = new MimeMessage(session);

        try {

            // Establecer la información básica del correo
            message.setFrom(new InternetAddress(correoremitente));
            message.setRecipients(Message.RecipientType.TO, destinatario);
            message.setSubject(mapMessage.get("subject").toString());

            //message.setText("PRUEBA CORREOS MASIVOS");
            StoredProcedureQuery adjuntos = repositorio.createNamedStoredProcedureQuery("paC_DocuEnvioCorreo");
            adjuntos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            adjuntos.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);

            adjuntos.setParameter("Bandera", Bandera);
            adjuntos.setParameter("IdPlantilla", IdPlantilla);

            adjuntos.getResultList();

            List<DocuEnvioCorreoEntity> documentos = adjuntos.getResultList();

            MimeBodyPart text = new MimeBodyPart();
            text.setContent(mapMessage.get("content"), "text/html;charset=UTF-8");
            MimeMultipart mp1 = new MimeMultipart();
            mp1.addBodyPart(text);
            MimeMultipart mp2 = new MimeMultipart();

            String[] rem = new String[documentos.size()];
            for (int h = 0; h < documentos.size(); h++) {
                String path = rem[h] = documentos.get(h).getRutaDocumento();

                InputStream st = new URL(path).openStream();
                URL url = new URL(path);
                File f = new File(URLDecoder.decode(url.getFile(), "UTF-8"));
                Files.copy(st,
                        Paths.get("C:\\SERV_CORREOS_AGROAPOYA2\\temp" + f),
                        StandardCopyOption.REPLACE_EXISTING);

                if (path != null && !"".equals(path)) {
                    String[] imgStrs = path.split(",");
                    for (int i = 0; i < imgStrs.length; i++) {

                        MimeBodyPart attach = new MimeBodyPart();
                        DataHandler dh = new DataHandler(new FileDataSource("C:\\SERV_CORREOS_AGROAPOYA2\\temp" + f));
                        attach.setDataHandler(dh);
                        attach.setFileName(dh.getName());
                        mp1.setSubType("related");
                        mp2.addBodyPart(attach);

                    }
                }
            }
            MimeBodyPart content = new MimeBodyPart();
            content.setContent(mp1);
            mp2.addBodyPart(content);
            mp2.setSubType("mixed");
            message.setContent(mp2);
            message.saveChanges();

        } catch (Exception e) {
        }
        return message;
    }
}
