package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CrearCampoManyChatEntity;
import com.cdi.com.Agroapoya2CDI.Services.CrearCampoManyChatService;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CrearCampoManyChatServiceImplementacion implements CrearCampoManyChatService {

    @Override
    public String CraerCampoMC(CrearCampoManyChatEntity entidad) {
        String Respuesta = "";
        try {

            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization", "Bearer 478118:7ec9b22d0d4b87182fcafa3a9ea04c55");
            headers.set("Content-Type", "application/json");

            JSONObject data = new JSONObject();
            data.put("caption", entidad.getCaption());
            data.put("type", entidad.getType());
            data.put("description", entidad.getDescription());

            HttpEntity<String> request = new HttpEntity<>(data.toString(), headers);
            ResponseEntity<String> response = restTemplate.exchange("https://api.manychat.com/fb/page/createCustomField", HttpMethod.POST, request, String.class);
            Object chatObjetc = response.getBody();
            Respuesta = chatObjetc.toString();
        } catch (Exception ex) {
            return JSONObject.quote(ex.toString());
        }
        return Respuesta;
    }

}
