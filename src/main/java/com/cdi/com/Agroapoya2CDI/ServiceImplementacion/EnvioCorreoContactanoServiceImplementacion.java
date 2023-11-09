package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Comun.clsEncriptacion;
import com.cdi.com.Agroapoya2CDI.Entity.EnvioCorreoContactanosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.RemitenteCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Services.EnvioCorreoContactanoService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.mail.Address;
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
public class EnvioCorreoContactanoServiceImplementacion implements EnvioCorreoContactanoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    public TemplateEngine templateEngine;

    Integer codigoproceso;
    String Respuesta;
    String asunto;
    String destinatario;
    String contenido;
    String imagenencabezado;
    String imagenpiepagina;

    @Override
    public String EnvioCorreoClienteCantactanos(EnvioCorreoContactanosEntity entidad, Integer bandera, Integer TipoContanto) {
        Map<String, Object> mapMessage = new HashMap<>();
        try {

            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("cliente_CorreoContactanos");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombrePersona", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonoPersona", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CorreoPersona", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuWhat", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoContanto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("MensajePersona", String.class, ParameterMode.IN);

            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("IdPlantilla", entidad.getIdPlantilla());
            rolconsola.setParameter("NombrePersona", entidad.getNombrePersona());
            rolconsola.setParameter("TelefonoPersona", entidad.getTelefonoPersona());
            rolconsola.setParameter("CorreoPersona", entidad.getEmail());
            rolconsola.setParameter("RespuWhat", entidad.getRespuWhat());
            rolconsola.setParameter("TipoContanto", TipoContanto);
            rolconsola.setParameter("MensajePersona", entidad.getMensajePersona());

            rolconsola.getResultList();
            List<EnvioCorreoContactanosEntity> cuerpocorreo = rolconsola.getResultList();

            Context context = new Context();
            String[] rem = new String[cuerpocorreo.size()];
            for (int i = 0; i < cuerpocorreo.size(); i++) {
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

            }
            String content = templateEngine.process("EnvioCorreos", context);
            mapMessage.put("subject", asunto);
            mapMessage.put("content", content);
            sendMessage(mapMessage, entidad, bandera, TipoContanto);
            Respuesta = JSONObject.quote("Correo Enviado Correctamente");

        } catch (Exception e) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia || EnvioCorreoIndividual");
        }
        return Respuesta;
    }

    public void sendMessage(Map<String, Object> mapMessage, EnvioCorreoContactanosEntity entidad, Integer bandera, Integer TipoContanto) throws Exception {
        try {
            String correoremitente = null;
            String servicePath = null;
            String contrasena = null;

            StoredProcedureQuery remitente = repositorio.createNamedStoredProcedureQuery("paC_RemitenteCorreo");
            remitente.getResultList();
            List<RemitenteCorreoEntity> remite = remitente.getResultList();
            String[] rem = new String[remite.size()];
            for (int i = 0; i < remite.size(); i++) {
                correoremitente = rem[i] = remite.get(i).getCorreoRemitente();
                servicePath = rem[i] = remite.get(i).getServicePath();
                contrasena = rem[i] = clsEncriptacion.Desencriptar(remite.get(i).getClave());
            }

            Properties props = new Properties();
            props.setProperty("mail.transport.protocol", "smtp"); // usa el protocolo pop3
            props.setProperty("mail.host", servicePath); // servidor pop3
            props.setProperty("mail.smtp.auth", "true");

            // Crear objeto de instancia de sesión
            Session session = Session.getInstance(props);
            session.setDebug(true);
            Transport ts = session.getTransport();
            ts.connect(servicePath, correoremitente, contrasena);
            // Crear correo electrónico
            Message message = createMixedMail(session, mapMessage, correoremitente, entidad, bandera, TipoContanto);
            //enviar correo electrónico 
            ts.sendMessage(message, message.getAllRecipients());
            ts.close();

        } catch (Exception ex) {

        }
    }

    public MimeMessage createMixedMail(Session session, Map<String, Object> mapMessage,
            String correoremitente, EnvioCorreoContactanosEntity entidad, Integer bandera, Integer TipoContanto) throws Exception {

        MimeMessage message = new MimeMessage(session);

        try {
            // Establecer la información básica del correo
            message.setFrom(new InternetAddress(correoremitente));

            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("cliente_CorreoContactanos");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombrePersona", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonoPersona", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CorreoPersona", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuWhat", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoContanto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("MensajePersona", String.class, ParameterMode.IN);

            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("IdPlantilla", entidad.getIdPlantilla());
            rolconsola.setParameter("NombrePersona", entidad.getNombrePersona());
            rolconsola.setParameter("TelefonoPersona", entidad.getTelefonoPersona());
            rolconsola.setParameter("CorreoPersona", entidad.getEmail());
            rolconsola.setParameter("RespuWhat", entidad.getRespuWhat());
            rolconsola.setParameter("TipoContanto", TipoContanto);
            rolconsola.setParameter("MensajePersona", entidad.getMensajePersona());

            rolconsola.getResultList();
            List<EnvioCorreoContactanosEntity> cuerpocorreo = rolconsola.getResultList();

            String[] r = new String[cuerpocorreo.size()];
            String[] ArregloDestinatarios = new String[cuerpocorreo.size()];

            for (int i = 0; i < cuerpocorreo.size(); i++) {
                destinatario = r[i] = cuerpocorreo.get(i).getEmail();
                ArregloDestinatarios[i] = destinatario;
            }

            Address[] tos = new InternetAddress[ArregloDestinatarios.length];
            if (ArregloDestinatarios != null && ArregloDestinatarios.length > 0) {
                for (int j = 0; j < ArregloDestinatarios.length; j++) {
                    tos[j] = new InternetAddress(ArregloDestinatarios[j]);
                }
                message.setRecipients(Message.RecipientType.TO, tos);
            } else {
                tos[0] = new InternetAddress(destinatario);
            }

            //message.setRecipients(Message.RecipientType.TO, destinatario);
            message.setSubject(mapMessage.get("subject").toString());
            //message.setText("blabla");

            MimeBodyPart text = new MimeBodyPart();
            text.setContent(mapMessage.get("content"), "text/html;charset=UTF-8");
            MimeMultipart mp1 = new MimeMultipart();
            mp1.addBodyPart(text);
            MimeMultipart mp2 = new MimeMultipart();

            MimeBodyPart content = new MimeBodyPart();
            content.setContent(mp1);
            mp2.addBodyPart(content);
            mp2.setSubType("mixed");
            message.setContent(mp2);
            message.saveChanges();
        } catch (Exception ex) {

        }
        return message;
    }

}
