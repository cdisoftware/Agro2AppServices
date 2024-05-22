package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ConsultaIdManyChatEntity;
import com.cdi.com.Agroapoya2CDI.Services.ConsultaIdManyChatService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsultaIdManyChatServiceImplementacion implements ConsultaIdManyChatService {

    @Override
    public String ConsIdMC(ConsultaIdManyChatEntity entidad) {

        //JSONObject ObjectJson = new JSONObject();
        try {

            RestTemplate rt = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization", "Bearer 478118:7ec9b22d0d4b87182fcafa3a9ea04c55");
            headers.set("Content-Type", "application/json");

            HttpEntity<String> request = new HttpEntity<>(headers);
            ResponseEntity<String> response = rt.exchange("https://api.manychat.com/fb/subscriber/findByCustomField?field_id=" + "8687658" + "&field_value=" + entidad.getField_value(), HttpMethod.GET, request, String.class);
            String jsonResponse = response.getBody();

            JSONObject jsonObject = new JSONObject(jsonResponse);
            JSONArray data = jsonObject.getJSONArray("data");
            JSONObject firstObject = data.getJSONObject(0);
            String idValue = firstObject.getString("id");

            return JSONObject.quote("1|" + idValue);
        } catch (Exception ex) {
            return JSONObject.quote("-1|no fue posible encontrar");
        }
    }
}
