package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Comun.clsEncriptacion;
import com.cdi.com.Agroapoya2CDI.Entity.EnvioCorreo_IndividualEntity;
import com.cdi.com.Agroapoya2CDI.Entity.RemitenteCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Services.EnvioCorreoTransportistaService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
/*
@Service
public class EnvioCorreoTransportistaServiceImplementacion implements EnvioCorreoTransportistaService {

    @PersistenceContext
    private EntityManager repositorio;
    
    //Archivo pdf
    File ArchivoPDF;

    //Data emisor
    String EmailSend = "williambernalcorredoresonline@gmail.com";
    String correoremitente = "";
    String contrasena = "";
    
    //Data correo
    String imagenencabezado;
    String asunto;
    String destinatario;
    String contenido;
    String imagenpiepagina;
    @Autowired
    public TemplateEngine templateEngine;
    
    
    String Resultado = "";


    @Override
    public String EnvioPdfTrans(Integer bandera, Integer Id_Clnte, Integer IdSctor, Integer IdPlantilla, Integer usucodig, Integer Cd_cnctvo, MultipartFile file) {
        try {
            //ContenidoMensaje
            Map<String, Object> mapMessage = new HashMap<>();
            
            //Resuelve plantilla
            StoredProcedureQuery consplantilla = repositorio.createNamedStoredProcedureQuery("paC_EnvioCorreo_Individual");
            consplantilla.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consplantilla.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            consplantilla.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            consplantilla.registerStoredProcedureParameter("Cd_cnctvo", Integer.class, ParameterMode.IN);
            consplantilla.registerStoredProcedureParameter("Id_Clnte", Integer.class, ParameterMode.IN);
            consplantilla.registerStoredProcedureParameter("IdSctor", Integer.class, ParameterMode.IN);

            consplantilla.setParameter("bandera", bandera);
            consplantilla.setParameter("IdPlantilla", IdPlantilla);
            consplantilla.setParameter("usucodig", usucodig);
            consplantilla.setParameter("Cd_cnctvo", Cd_cnctvo);
            consplantilla.setParameter("Id_Clnte", Id_Clnte);
            consplantilla.setParameter("IdSctor", IdSctor);
            consplantilla.getResultList();
            List<EnvioCorreo_IndividualEntity> cuerpocorreo = consplantilla.getResultList();

            Context context = new Context();
            String[] rem = new String[cuerpocorreo.size()];
            for (int i = 0; i < cuerpocorreo.size(); i++) {
                if(i > 0){
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
            }
            String content = templateEngine.process("EnvioCorreos", context);
            mapMessage.put("subject", asunto);
            mapMessage.put("content", content);
            
            
            //Convierteelarchivoenpdf
            ArchivoPDF = convertMultipartFileToPDF(file);
            
            //Obtiene data de emisor
            String servicePath = null;
            StoredProcedureQuery remitente = repositorio.createNamedStoredProcedureQuery("paC_RemitenteCorreo");
            remitente.getResultList();
            List<RemitenteCorreoEntity> remite = remitente.getResultList();
            int count = remite.size();
            String[] auxrem = new String[count];
            for (int i = 0; i < remite.size(); i++) {
                correoremitente = auxrem[i] = remite.get(i).getCorreoRemitente();
                servicePath = auxrem[i] = remite.get(i).getServicePath();
                contrasena = auxrem[i] = clsEncriptacion.Desencriptar(remite.get(i).getClave());
            }
            
            //Propiedades del correo
            Properties props = new Properties();
            props.setProperty("mail.transport.protocol", "smtp"); // usa el protocolo pop3
            props.setProperty("mail.host", servicePath); // servidor pop3
            props.setProperty("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            
            //Inia Seccion Correo Electronico
            Session session = Session.getInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(correoremitente, contrasena);
                }
            });
            
            // Crear el mensaje de correo electrónico
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoremitente));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(EmailSend));
            message.setSubject(asunto);

            // Crear la parte del cuerpo del mensaje para el archivo adjunto
            Multipart multipart = new MimeMultipart();
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(context, content);

            // Adjuntar el archivo PDF al mensaje
            DataSource source = new FileDataSource(ArchivoPDF);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("RutaTransportista.pdf");
            multipart.addBodyPart(messageBodyPart);

            // Establecer las partes del mensaje
            message.setContent(multipart);

            // Enviar el mensaje
            Transport.send(message);

            Resultado = "El correo electrónico fue enviado con éxito.";
        }catch (Exception ex){
            Resultado = ex.getMessage();
        }
        return Resultado;
    }

    public static File convertMultipartFileToPDF(MultipartFile multipartFile) throws IOException {
        File tempFile = File.createTempFile("temp", ".pdf");

        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(multipartFile.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

        return tempFile;
    }
}
*/