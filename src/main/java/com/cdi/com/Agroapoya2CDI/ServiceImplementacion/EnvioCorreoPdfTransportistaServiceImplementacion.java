package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Comun.clsEncriptacion;
import com.cdi.com.Agroapoya2CDI.Entity.DocuEnvioCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.EnvioCorreo_IndividualEntity;
import com.cdi.com.Agroapoya2CDI.Entity.RemitenteCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Services.EnvioCorreoTransportistaService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Multipart;
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
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class EnvioCorreoPdfTransportistaServiceImplementacion implements EnvioCorreoTransportistaService {

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
    
    //Archivo pdf
    File ArchivoPDF;

    @Override
    public String EnvioPdfTrans(Integer bandera, Integer Id_Clnte, Integer IdSctor, Integer IdPlantilla, Integer usucodig, Integer Cd_cnctvo, MultipartFile file) {
        Map<String, Object> mapMessage = new HashMap<>();
        try {
            ArchivoPDF = convertMultipartFileToPDF(file);
            
            Context context = new Context();
            
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paC_EnvioCorreo_Individual");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Cd_cnctvo", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Id_Clnte", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdSctor", Integer.class, ParameterMode.IN);

            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("IdPlantilla", IdPlantilla);
            rolconsola.setParameter("usucodig", usucodig);
            rolconsola.setParameter("Cd_cnctvo", Cd_cnctvo);
            rolconsola.setParameter("Id_Clnte", Id_Clnte);
            rolconsola.setParameter("IdSctor", IdSctor);
            rolconsola.getResultList();
            List<EnvioCorreo_IndividualEntity> cuerpocorreo = rolconsola.getResultList();

            imagenencabezado = "https://api.apptotrip.com/ImagenesAgroapoya2/ImagenesPublicidad/correocabeza.jpeg";
            asunto = " Bienvenido a AgroApoya2, tenemos el gusto de que hagas parte de nuestra familia";
            destinatario = "williambernalcorredoresonline@gmail.com";//rem[i] = cuerpocorreo.get(i).getEmail();
            contenido = "<br /> <br /> Gracias  por hacer parte de la comunidad digital que apoya el comercio justo.    &#129303; <br> Estamos  preparando nuestra plataforma para que puedas ofrecer tus productos a los mejores precios.<br><br>Nuestros clientes ya están  listos para hacer sus pedidos, tan pronto tengas lista la información de tu cosecha,<br>publícala en nuestra plataforma,  nosotros nos encargamos de transportarla y venderla.<br><br> <strong>Te recordamos algunos de nuestros beneficios:</strong> <br><br>• Puedes  ofertar varios productos &#x1F34C; &#x1f954; &#x1f955;<br>• Vendes directamente al cliente, SIN INTERMEDIARIOS &#x1f91d;  <br>• Contarás con un transportista cercano que entregué tus productos &#x1f69a;<br>• Recibes el precio justo de la  compra &#x1f64c; <br><br><strong>¿ Cómo públicas una oferta en la plataforma ?</strong><br><br> 1. Ingresas a la plataforma con tu cuenta ya  registrada <a href=\"https://apoya2.co/#/\" style=\"color: #0DA7B0;\"> AQUÍ </a><br>2. Creas la oferta y esperas su  activación <br> 3. Esperas la solicitud del producto por parte del cliente <br> 4. Aprobamos el transportista que cargará  el pedido.<br><br> Ingresa ¡YA! y publica. Recibirás el pago de tus productos en la forma que tu escojas(Efectivo,  transferencia, Nequi, Efecty, entro otros).<br><br>No olvides seguirnos en nuestras redes sociales, en donde también  podrás encontrar información de tu interés. <br><br><strong>Si tienes alguna inquietud, no olvides en contactarnos vía WhatsApp  al 3005617884.</strong> <br><br>";
            imagenpiepagina = "https://api.apptotrip.com/ImagenesAgroapoya2/ImagenesPublicidad/pie.png";

            context.setVariable("imagenencabezado", imagenencabezado);
            context.setVariable("destinatario", destinatario);
            context.setVariable("asunto", asunto);
            context.setVariable("contenido", contenido);
            context.setVariable("imagenpiepagina", imagenpiepagina);

            String content = templateEngine.process("EnvioCorreos", context);
            mapMessage.put("subject", asunto);
            mapMessage.put("content", content);
            sendMessage(mapMessage, bandera, Id_Clnte, IdSctor, IdPlantilla, usucodig, Cd_cnctvo);
            Respuesta = JSONObject.quote("Correo Enviado Correctamente");

        } catch (Exception e) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia || EnvioCorreoIndividual");
        }
        return Respuesta;
    }

    public void sendMessage(Map<String, Object> mapMessage, Integer bandera, Integer Id_Clnte, Integer IdSctor, Integer IdPlantilla, Integer usucodig, Integer Cd_cnctvo) throws Exception {
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
            props.put("mail.smtp.starttls.enable", "true");

            // Crear objeto de instancia de sesión
            Session session = Session.getInstance(props);
            session.setDebug(true);
            Transport ts = session.getTransport();
            ts.connect(servicePath, correoremitente, contrasena);
            // Crear correo electrónico
            Message message = createMixedMail(session, mapMessage, correoremitente, bandera, Id_Clnte, IdSctor, IdPlantilla, usucodig, Cd_cnctvo);
            //enviar correo electrónico 
            ts.sendMessage(message, message.getAllRecipients());
            ts.close();

        } catch (Exception ex) {

        }
    }

    public MimeMessage createMixedMail(Session session, Map<String, Object> mapMessage, String correoremitente, Integer bandera, Integer Id_Clnte, Integer IdSctor, Integer IdPlantilla, Integer usucodig, Integer Cd_cnctvo) throws Exception {

        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(correoremitente));

            Address[] tos = new InternetAddress[1];
            tos[0] = new InternetAddress(destinatario);

            message.setSubject(mapMessage.get("subject").toString());

            message.setRecipients(Message.RecipientType.TO, tos);

            MimeBodyPart text = new MimeBodyPart();
            text.setContent(mapMessage.get("content"), "text/html;charset=UTF-8");
            MimeMultipart mp1 = new MimeMultipart();
            mp1.addBodyPart(text);
            MimeMultipart mp2 = new MimeMultipart();
            
            
            
            // Crear la parte del cuerpo del mensaje para el archivo adjunto
            MimeBodyPart messageBodyPart = new MimeBodyPart();

            // Adjuntar el archivo PDF al mensaje
            DataSource source = new FileDataSource(ArchivoPDF);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("RutaTransportista.pdf");
            mp2.addBodyPart(messageBodyPart);
            

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
