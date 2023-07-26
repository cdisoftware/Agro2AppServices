package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ManyChatUpdateUserEntity;
import com.cdi.com.Agroapoya2CDI.Services.ManyChatUpdateUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ManyChatUpdateUserServiceImplemenatcion implements ManyChatUpdateUserService {

    @Override
    public String UpdateUserManyChat(ManyChatUpdateUserEntity entidad) {
        String Respuesta = "";
        try {

            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization", "Bearer 478118:7ec9b22d0d4b87182fcafa3a9ea04c55");
            headers.set("Content-Type", "application/json");

            JSONObject data = new JSONObject();
            data.put("subscriber_id", entidad.getSubscriber_id());
            data.put("first_name", entidad.getFirst_name());
            data.put("last_name", entidad.getLast_name());
            data.put("whatsapp_phone", entidad.getWhatsapp_phone());
            data.put("has_opt_in_sms", entidad.getHas_opt_in_sms());
            data.put("has_opt_in_email", entidad.getHas_opt_in_email());
            data.put("consent_phrase", entidad.getConsent_phrase());

            HttpEntity<String> request = new HttpEntity<>(data.toString(), headers);
            ResponseEntity<String> response = restTemplate.exchange("https://api.manychat.com/fb/subscriber/updateSubscriber", HttpMethod.POST, request, String.class);
            Object chatObjetc = response.getBody();

            Respuesta = chatObjetc.toString();

        } catch (Exception ex) {
            return JSONObject.quote(ex.toString());
        }
        return Respuesta;
    }

}
