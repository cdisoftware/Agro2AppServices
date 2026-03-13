package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Comun.clsEncriptacion;
import com.cdi.com.Agroapoya2CDI.Entity.CEnvioCorreoIndEmailEntity;
import com.cdi.com.Agroapoya2CDI.Entity.DocuEnvioCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.RemitenteCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CEnvioCorreoIndEmailService;
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
public class CEnvioCorreoIndEmailServiceImplementacion implements CEnvioCorreoIndEmailService {

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
    public String EnvioCorreoIndEmail(CEnvioCorreoIndEmailEntity entidad, Integer bandera) {
        Map<String, Object> mapMessage = new HashMap<>();
        try {
            Context context = new Context();
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paC_EnvioCorreo_IndEmail");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CorreoPersona", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("cd_cnctvo", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TextTres", String.class, ParameterMode.IN);

            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("IdPlantilla", entidad.getIdPlantilla());
            rolconsola.setParameter("CorreoPersona", entidad.getEmail());
            rolconsola.setParameter("cd_cnctvo", entidad.getCd_cnctvo());
            rolconsola.setParameter("IdSector", entidad.getIdSector());
            rolconsola.setParameter("TextUno", entidad.getTextUno());
            rolconsola.setParameter("TextDos", entidad.getTextDos());
            rolconsola.setParameter("TextTres", entidad.getTextTres());

            rolconsola.getResultList();
            List<CEnvioCorreoIndEmailEntity> cuerpocorreo = rolconsola.getResultList();

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
            sendMessage(mapMessage, entidad, bandera);
            Respuesta = JSONObject.quote("Correo Enviado Correctamente");

        } catch (Exception e) {
            return JSONObject.quote("ERROR LOG (paC_EnvioCorreo_IndEmail)"
                    + " - Parametros: " + bandera + "/" + entidad.getIdPlantilla() + "/" + entidad.getEmail() + "/" + entidad.getCd_cnctvo()
                    + "/" + entidad.getIdSector() + "/" + entidad.getTextUno() + "/" + entidad.getTextDos() + "/" + entidad.getTextTres()
                    + " - ERROR JAVA = " + e);
        }
        return Respuesta;
    }

    public void sendMessage(Map<String, Object> mapMessage, CEnvioCorreoIndEmailEntity entidad, Integer bandera) throws Exception {
        try {
            String correoremitente = null;
            String servicePath = null;
            String contrasena = null;

            StoredProcedureQuery remitente = repositorio.createNamedStoredProcedureQuery("paC_RemitenteCorreo");
            List<RemitenteCorreoEntity> remite = remitente.getResultList();

            for (RemitenteCorreoEntity r : remite) {
                correoremitente = r.getCorreoRemitente();
                servicePath = r.getServicePath();
                contrasena = clsEncriptacion.Desencriptar(r.getClave());
            }

            Properties props = new Properties();
            props.setProperty("mail.transport.protocol", "smtp");
            props.setProperty("mail.smtp.host", servicePath);
            props.setProperty("mail.smtp.auth", "true");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.starttls.required", "true");
            props.setProperty("mail.smtp.ssl.trust", servicePath);
            props.put("mail.smtp.port", "587"); 

            // Crear la sesión
            Session session = Session.getInstance(props);
            session.setDebug(true);

            Transport ts = session.getTransport();
            ts.connect(servicePath, correoremitente, contrasena);

            Message message = createMixedMail(session, mapMessage, correoremitente, entidad, bandera);

            ts.sendMessage(message, message.getAllRecipients());
            ts.close();

        } catch (Exception ex) {
            System.out.println("ERROR LOG (paC_RemitenteCorreo || paC_EnvioCorreo_IndEmail)"
                    + " - ERROR JAVA = " + ex);
        }
    }

    public MimeMessage createMixedMail(Session session, Map<String, Object> mapMessage,
            String correoremitente, CEnvioCorreoIndEmailEntity entidad, Integer bandera) throws Exception {

        MimeMessage message = new MimeMessage(session);

        try {
            // Establecer la información básica del correo
            message.setFrom(new InternetAddress(correoremitente));
            message.setRecipients(Message.RecipientType.TO, destinatario);
            message.setSubject(mapMessage.get("subject").toString());
            //message.setText("blabla");

            StoredProcedureQuery adjuntos = repositorio.createNamedStoredProcedureQuery("paC_DocuEnvioCorreo");
            adjuntos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            adjuntos.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            adjuntos.setParameter("Bandera", bandera);
            adjuntos.setParameter("IdPlantilla", entidad.getIdPlantilla());
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
        } catch (Exception ex) {
            System.out.println("ERROR LOG (paC_DocuEnvioCorreo || paC_EnvioCorreo_IndEmail)"
                    + " - ERROR JAVA = " + ex);
        }
        return message;
    }

}
