package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ChatGPTentity;
import com.cdi.com.Agroapoya2CDI.Services.ChatGPTservice;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChatGPTserviceImplementacion implements ChatGPTservice {

    @Override
    public String ChatGPTCons(ChatGPTentity entidad) {
        String Respuesta = "";
        try {

            RestTemplate restTemplate = new RestTemplate();
          
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Content-Type", "application/json");
            headers.set("Authorization", "Bearer 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");

            JSONObject data = new JSONObject();
            data.put("model", "text-davinci-003");
            data.put("prompt", entidad.getTexto());
            data.put("max_tokens", 4000);
            data.put("temperature", 1.0);

            HttpEntity<String> request = new HttpEntity<>(data.toString(), headers);
            ResponseEntity<String> response = restTemplate.exchange("https://api.openai.com/v1/completions", HttpMethod.POST, request, String.class);
            Object chatObjetc = response.getBody();

            Respuesta = chatObjetc.toString();

        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos: Error" + ex);
        }
        return Respuesta;
    }

}
