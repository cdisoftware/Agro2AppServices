package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

/**
 * @author Ing Juan José Gutiérrez // ENVIO DE CORREOS MASIVOS 
 */
import com.cdi.com.Agroapoya2CDI.Entity.CEnvioRealCorreo_ConsultaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CorreosMasivosPandaService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class CorreosMasivosPandaServiceImplementacion implements CorreosMasivosPandaService {

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
    public String ConsCorreosMasivosPanda(Integer bandera, Integer IdPlantilla, Integer IdTipoUsuario, Integer cd_cnctvo, Integer IdSector) {
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
        try {
            Context context = new Context();
            StoredProcedureQuery cuerpo = repositorio.createNamedStoredProcedureQuery("paCEnvioRealCorreo_Consulta");
            cuerpo.registerStoredProcedureParameter("CodigoProceso", Integer.class, ParameterMode.IN);

            cuerpo.setParameter("CodigoProceso", respu);
            cuerpo.getResultList();
            List<CEnvioRealCorreo_ConsultaEntity> cuerpocorreo = cuerpo.getResultList();
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
                JSONObject fromEmail = new JSONObject();
                fromEmail.put("email", "agroapoya2@cdi.com.co");
                fromEmail.put("name", "AgroApoya2");
                JSONObject replyEmail = new JSONObject();
                replyEmail.put("email", "rdiazruiz@gmail.com");
                replyEmail.put("name", "Ricardo Arturo Diaz");
                RestTemplate rt = new RestTemplate();
                HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                    @Override
                    public boolean verify(String hostname, SSLSession session) {
                        return true;
                    }
                });
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                headers.set("Authorization", "Bearer ed4068a8.86e0412a8ec084cf8439a5e1");
                headers.set("Content-Type", "application/json");
                JSONObject toEmail = new JSONObject();
                toEmail.put("email", destinatario);
                JSONArray toArray = new JSONArray();
                toArray.put(toEmail);
                JSONObject bodyFinal = new JSONObject();
                bodyFinal.put("to", toArray);
                bodyFinal.put("from", fromEmail);
                bodyFinal.put("replyTo", replyEmail);
                bodyFinal.put("subject", asunto);
                bodyFinal.put("body", content);
                HttpEntity<Object> request = new HttpEntity<>(bodyFinal.toString(), headers);
                ResponseEntity<Object> response = rt.exchange("http://api.ckpnd.com:5000/v1/email", HttpMethod.POST, request, Object.class);
                //Object sucesosObject = response.getBody();
                //ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                //String json = ow.writeValueAsString(sucesosObject);
                // Respuesta = json.toString();
            }
            Respuesta = JSONObject.quote("Correo Enviado Correctamente");
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
        return Respuesta;
    }
}
