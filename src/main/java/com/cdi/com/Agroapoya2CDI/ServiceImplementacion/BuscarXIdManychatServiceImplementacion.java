
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.BuscarXIdManychatEntity;
import com.cdi.com.Agroapoya2CDI.Services.BuscarXIdManychatService;
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
public class BuscarXIdManychatServiceImplementacion implements BuscarXIdManychatService{

    @Override
    public String ConsultarIdmanychatInfo(BuscarXIdManychatEntity entidad) {
       JSONObject ObjectJson = new JSONObject();
        try {
            RestTemplate rt = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization", "Bearer 478118:7ec9b22d0d4b87182fcafa3a9ea04c55");
            headers.set("Content-Type", "application/json");

            HttpEntity<String> request = new HttpEntity<>(headers);
            ResponseEntity<Object> response = rt.exchange("https://api.manychat.com/fb/subscriber/getInfo?subscriber_id=" + entidad.getIdManyChat(), HttpMethod.GET, request, Object.class);
            Object Respuesta = response.getBody();
            com.fasterxml.jackson.databind.ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(Respuesta);
            ObjectJson = new JSONObject(json);
            
            // Extracción de valores específicos
            String firstName = ObjectJson.getJSONObject("data").getString("first_name");
            String whatsappPhone = ObjectJson.getJSONObject("data").getString("whatsapp_phone");
            
            // Creación de un nuevo JSON con solo los valores necesarios
            JSONObject resultJson = new JSONObject();
            resultJson.put("first_name", firstName);
            resultJson.put("whatsapp_phone", whatsappPhone);

            return resultJson.toString();           
        } catch (Exception ex) {
            return JSONObject.quote("Usuario NO existe");
        }       
    }
    
}
