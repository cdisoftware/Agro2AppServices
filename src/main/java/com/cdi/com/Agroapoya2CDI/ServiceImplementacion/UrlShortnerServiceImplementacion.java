package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.UrlShortnerEntity;
import com.cdi.com.Agroapoya2CDI.Services.UrlShortnerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Collections;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
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
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();

            parameters.add("longUrl", entidad.getLongUrl());
            ResponseEntity<Object> response = rt.exchange("https://api-ssl.bitly.com/v3/shorten?access_token=07d0baa590598f6b9a8d9963c05d2b1a37f2e824&longUrl=" + entidad.getLongUrl(), HttpMethod.POST, null, Object.class);
            Object NitObject = response.getBody();
            com.fasterxml.jackson.databind.ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(NitObject);
            ObjectJson = new JSONObject(json);
            JSONObject urlJson = ObjectJson.getJSONObject("data");
            if ("{}".equals(ObjectJson.toString())) {
                return "[]";
            }
            return urlJson.toString();
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
