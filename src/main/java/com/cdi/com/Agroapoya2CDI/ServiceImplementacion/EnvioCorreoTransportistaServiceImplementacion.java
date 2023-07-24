package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Comun.clsEncriptacion;
import com.cdi.com.Agroapoya2CDI.Entity.RemitenteCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Services.EnvioCorreoTransportistaService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EnvioCorreoTransportistaServiceImplementacion implements EnvioCorreoTransportistaService {

    @PersistenceContext
    private EntityManager repositorio;

    File ArchivoPDF;

    String EmailSend = "williambernalcorredoresonline@gmail.com";
    String correoremitente = "";
    String contrasena = "";
    
    
    String Resultado = "";


    @Override
    public String EnvioPdfTrans(MultipartFile file) {
        try {
            ArchivoPDF = convertMultipartFileToPDF(file);
            
            String servicePath = null;

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
            props.put("mail.smtp.starttls.enable", "true");
            
            
            Session session = Session.getInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(correoremitente, contrasena);
                }
            });
            
            // Crear el mensaje de correo electrónico
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoremitente));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(EmailSend));
            message.setSubject("Prueba WilliamBernal");

            // Cuerpo del mensaje (opcional)
            String messageContent = "Prueba EnvioCorreo pdf";
            message.setText(messageContent);

            // Crear la parte del cuerpo del mensaje para el archivo adjunto
            Multipart multipart = new MimeMultipart();
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(messageContent);

            // Adjuntar el archivo PDF al mensaje
            DataSource source = new FileDataSource(ArchivoPDF);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("RutaTRansportista.pdf");
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
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            //ConsultaInfoEmailRemitente
            /*String correoremitente = null;
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
            
            
            // Propiedades para la configuración del servidor SMTP
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", port);
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");

            Session session = Session.getInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            });
            
            // Crear el mensaje de correo electrónico
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject("Prueba WilliamBernal");

            // Cuerpo del mensaje (opcional)
            String messageContent = "Prueba EnvioCorreo pdf";
            message.setText(messageContent);

            // Crear la parte del cuerpo del mensaje para el archivo adjunto
            Multipart multipart = new MimeMultipart();
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(messageContent);

            // Adjuntar el archivo PDF al mensaje
            DataSource source = new FileDataSource(ArchivoPDF);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("RutaTRansportista.pdf");
            multipart.addBodyPart(messageBodyPart);

            // Establecer las partes del mensaje
            message.setContent(multipart);

            // Enviar el mensaje
            Transport.send(message);

            Resultado = "El correo electrónico fue enviado con éxito.";
            
            
        } catch (IOException ex) {
            Resultado = ex.getMessage();
        } catch (AddressException ex) {
            Resultado = ex.getMessage();
        } catch (MessagingException ex) {
            Resultado = ex.getMessage();
        }
        return Resultado;*/
    }

    public static File convertMultipartFileToPDF(MultipartFile multipartFile) throws IOException {
        // Crear un archivo temporal para almacenar los datos del MultipartFile
        File tempFile = File.createTempFile("temp", ".pdf");

        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            // Escribir los datos del MultipartFile en el archivo temporal
            fos.write(multipartFile.getBytes());
        } catch (IOException e) {
            // Manejar cualquier excepción de E/S aquí si es necesario
            e.printStackTrace();
            throw e;
        }

        return tempFile;
    }
}
