package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;


import com.cdi.com.Agroapoya2CDI.Entity.UrlShortnerEntity;
import com.cdi.com.Agroapoya2CDI.Services.UrlShortnerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class UrlShortnerServiceImplementacion implements UrlShortnerService {

    @Override
    public String ConsultaUrlShortner(UrlShortnerEntity entidad) {
        JSONObject ObjectJson = new JSONObject();
        try {
            RestTemplate rt = new RestTemplate();
            MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
            parameters.add("longUrl", entidad.getLongUrl());
            String UrlLong = entidad.getLongUrl().replace("#", "%23").replace("?", "%3F").replaceAll("&", "%26");
            ResponseEntity<String> response = rt.exchange("https://api-ssl.bitly.com/v3/shorten?access_token=07d0baa590598f6b9a8d9963c05d2b1a37f2e824&longUrl=" + UrlLong, HttpMethod.POST, null, String.class);
            Object NitObject = response.getBody();
            com.fasterxml.jackson.databind.ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(NitObject);
            ObjectJson = new JSONObject(json);
            String urlJson = ObjectJson.getJSONObject("data").getString("url");
            return JSONObject.quote(urlJson);

        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
