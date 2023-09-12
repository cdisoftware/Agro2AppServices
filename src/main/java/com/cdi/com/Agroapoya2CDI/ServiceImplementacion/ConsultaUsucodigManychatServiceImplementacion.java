package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ConsultaUsucodigManychatEntity;
import com.cdi.com.Agroapoya2CDI.Services.ConsultaUsucodigManychatService;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsultaUsucodigManychatServiceImplementacion implements ConsultaUsucodigManychatService {

    @Override
    public String ConsUsucodigMC(ConsultaUsucodigManychatEntity entidad) {
        String Respuesta = "";
        try {
            RestTemplate rt = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization", "Bearer 478118:7ec9b22d0d4b87182fcafa3a9ea04c55");
            headers.set("Content-Type", "application/json");

            HttpEntity<String> request = new HttpEntity<>(headers);
            ResponseEntity<String> response = rt.exchange("https://api.manychat.com/fb/subscriber/findByCustomField?field_id=" + entidad.getField_id() + "&field_value=" + entidad.getField_value(), HttpMethod.GET, request, String.class);
            Object chatObjetc = response.getBody();
            Respuesta = chatObjetc.toString();
        } catch (Exception ex) {
            return JSONObject.quote("Usuario NO existe");
        }
        return Respuesta;
    }
}
