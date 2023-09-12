package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ManyChatCreateUserEntity;
import com.cdi.com.Agroapoya2CDI.Services.ManyChatCreateUserService;
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
public class ManyChatCreateUserServiceImplementacion implements ManyChatCreateUserService {

    @Override
    public String ModManyChatCraeteUser(ManyChatCreateUserEntity entidad) {
        //String Respuesta = "";
        JSONObject ObjectJson = new JSONObject();
        try {

            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization", "Bearer 478118:7ec9b22d0d4b87182fcafa3a9ea04c55");
            headers.set("Content-Type", "application/json");

            JSONObject data = new JSONObject();
            data.put("first_name", entidad.getFirst_name());
            data.put("last_name", entidad.getLast_name());
            data.put("whatsapp_phone", entidad.getWhatsapp_phone());
            data.put("has_opt_in_sms", entidad.getHas_opt_in_sms());
            data.put("has_opt_in_email", entidad.getHas_opt_in_email());
            data.put("consent_phrase", entidad.getConsent_phrase());

            HttpEntity<String> request = new HttpEntity<>(data.toString(), headers);
            ResponseEntity<Object> response = restTemplate.exchange("https://api.manychat.com/fb/subscriber/createSubscriber", HttpMethod.POST, request, Object.class);
            //Object chatObjetc = response.getBody();
            //Respuesta = chatObjetc.toString();
            Object Respuesta = response.getBody();
            com.fasterxml.jackson.databind.ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(Respuesta);
            ObjectJson = new JSONObject(json);
            String urlJson = ObjectJson.getJSONObject("data").getString("id");
            return JSONObject.quote(urlJson);         
                        
        } catch (Exception ex) {            
            //return JSONObject.quote(ex.toString());
            return JSONObject.quote("Usuario ya existe");
        }
        //return Respuesta;
    }

}
