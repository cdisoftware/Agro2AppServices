package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.FirebaseNotificationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class FirebaseNotificationServiceImplementacion implements FirebaseNotificationService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String FirebaseNoti(Integer bandera) {
        String Respuesta = "";
        try {
            String TokenUsuario = "e0fbu9MrHVE:APA91DGAZ10PGYH-ZLWONKQkmI7NJoXwUGecxE2df7rAlrCDPtpfYmm68z";
            try {
                RestTemplate restTemplate = new RestTemplate();
                HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                    @Override
                    public boolean verify(String hostname, SSLSession session) {
                        return true;
                    }
                });
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                headers.set("Authorization", "key=AAAAJtpTlrg:APA91bEC0GWK40w6sOxG1q33y4MPUw06aqyB1xzgWd2ZomcsB12YmtOFePYC0apI-V3XzWw_8IRf6y-tua0ySnk6fF5CnmsTqFU0xmY3Oqz4WoUeFvKiRVHQyQkErh73kwn4pjGhAU-G");
                JSONObject bodyFinal = new JSONObject();
                bodyFinal.put("to", TokenUsuario);
                bodyFinal.put("priority", "high");
                JSONObject notification = new JSONObject();
                notification.put("body", "mensaje de prueba");
                notification.put("title", "PRUEBA AGROAPOYA2");

                bodyFinal.put("notification", notification);
                HttpEntity<String> request = new HttpEntity<>(bodyFinal.toString(), headers);
                ResponseEntity<String> response = restTemplate.exchange("https://fcm.googleapis.com/fcm/send", HttpMethod.POST, request, String.class);
                Object sucesosObject = response.getBody();
                ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                String json = ow.writeValueAsString(sucesosObject);
                Respuesta = json.toString();
            } catch (JsonProcessingException | JSONException | RestClientException e) {
                return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
            }

        } catch (Exception e) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
        return Respuesta;
    }

}
