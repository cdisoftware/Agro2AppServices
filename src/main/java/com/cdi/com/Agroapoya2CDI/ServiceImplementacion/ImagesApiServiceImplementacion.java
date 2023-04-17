package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ImagesApiEntity;
import com.cdi.com.Agroapoya2CDI.Services.ImagesApiService;
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
public class ImagesApiServiceImplementacion implements ImagesApiService {

    @Override
    public String ConsultaImagenes() {
        String Respuesta = "";
        String per_page = "1";
        String page = "1";
        String query = "casa";

        try {
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
               headers.set("Content-Type", "application/json");
            headers.set("Authorization", "vQtHtRKYykDav1iq1Ua4735DCyrUg9ZKM3TAHSyef32sd9AKXQyQaQph");

            MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
            parameters.add("per_page", per_page);
            parameters.add("page", page);
            parameters.add("query", query);

            HttpEntity<String> request = new HttpEntity<>(parameters.toString(), headers);
            ResponseEntity<String> response = restTemplate.exchange("https://api.pexels.com/v1/search?per_page="+ per_page + "&page=" + page + "&query" + query, HttpMethod.GET, request, String.class);
            Object chatObjetc = response.getBody();

            Respuesta = chatObjetc.toString();

        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos: Error" + ex);
        }
        return Respuesta;
    }

}
