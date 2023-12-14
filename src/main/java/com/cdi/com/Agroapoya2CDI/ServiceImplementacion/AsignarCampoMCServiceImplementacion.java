package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.AsignarCampoMCEntity;
import com.cdi.com.Agroapoya2CDI.Services.AsignarCampoMCService;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AsignarCampoMCServiceImplementacion implements AsignarCampoMCService {

    @Override
    public String AsignarCampoUser(AsignarCampoMCEntity entidad) {
        String Respuesta = "";
        try {

            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization", "Bearer 478118:7ec9b22d0d4b87182fcafa3a9ea04c55");
            headers.set("Content-Type", "application/json");

            JSONObject data = new JSONObject();
            data.put("subscriber_id", entidad.getSubscriber_id());
            data.put("field_id", entidad.getField_id());
            data.put("field_value", entidad.getField_value());

            HttpEntity<String> request = new HttpEntity<>(data.toString(), headers);
            ResponseEntity<String> response = restTemplate.exchange("https://api.manychat.com/fb/subscriber/setCustomField", HttpMethod.POST, request, String.class);
            Object chatObjetc = response.getBody();
            //Respuesta = chatObjetc.toString();
            Respuesta = JSONObject.quote("1");
        } catch (Exception ex) {
            return JSONObject.quote("ERROR: -1 " + ex);
        }
        return Respuesta;
    }

}
