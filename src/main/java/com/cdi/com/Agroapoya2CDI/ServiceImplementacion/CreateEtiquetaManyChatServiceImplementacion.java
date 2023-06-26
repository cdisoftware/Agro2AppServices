
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CreateTagEntity;
import com.cdi.com.Agroapoya2CDI.Services.CreateEtiquetaManyChatService;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class CreateEtiquetaManyChatServiceImplementacion implements CreateEtiquetaManyChatService{

    @Override
    public String CreateEtiquetaManyChat(CreateTagEntity entidad) {
        String Respuesta = "";
        try {
            RestTemplate rt = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization", "Bearer 478118:7ec9b22d0d4b87182fcafa3a9ea04c55");
            headers.set("Content-Type", "application/json");

            JSONObject data = new JSONObject();
            data.put("name", entidad.getName());
            
            HttpEntity<String> request = new HttpEntity<>(data.toString(), headers);
            ResponseEntity<String> response = rt.exchange("https://api.manychat.com/fb/page/createTag", HttpMethod.POST, request, String.class);
            Object chatObjetc = response.getBody();

            Respuesta = chatObjetc.toString();
        } catch (Exception ex) {
            return "Error:" + ex.getMessage();
        }
        return Respuesta;
    }
}
