package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.EnvioSMSIndvAA2Entity;
import com.cdi.com.Agroapoya2CDI.Services.EnvioSMSIndvAA2Service;
import org.json.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

@Service
public class EnvioSMSIndvAA2ServiceImplementacion implements EnvioSMSIndvAA2Service {

    @Override
    public String EnvioSMSIndvAA2(EnvioSMSIndvAA2Entity entidad) {

        String respuesta = "";
        String token = "NqZT6M9dwq1PDU5c5fzF9kjHFmEFQuNt";

        try {

            HttpResponse<String> response = Unirest.post("https://api.labsmobile.com/json/send")
                    .header("Content-Type", "application/json")
                    .basicAuth("rdiaz@cdi.com.co", token)
                    .header("Cache-Control", "no-cache")
                    .body(
                        "{"
                        + "\"message\":\"" + entidad.Mensaje + "\","
                        + "\"tpoa\":\"Sender\","
                        + "\"recipient\":[{\"msisdn\":\""+entidad.Telefono+"\"}]"
                        + "}"
                    )
                    .asString();

            System.out.println("Status HTTP: " + response.getStatus());
            System.out.println("Respuesta API: " + response.getBody());

            String responseBody = response.getBody();

            // Procesamiento de la respuesta
            String[] parts = responseBody.split(",");

            if (parts.length > 1) {
                String status = parts[1].replace("<br>", "").trim();

                switch (status) {
                    case "-4":
                        respuesta = JSONObject.quote("El número no cumple con la cantidad de caracteres.");
                        break;
                    case "0":
                        respuesta = JSONObject.quote("El operador no existe.");
                        break;
                    case "-3":
                        respuesta = JSONObject.quote("No hay saldo suficiente para el envío de SMS.");
                        break;
                    default:
                        respuesta = JSONObject.quote("Mensaje enviado corectamente.");
                        break;
                }
            } else {
                respuesta = JSONObject.quote("Respuesta inesperada del servicio de envío SMS.");
            }

        } catch (Exception ex) {
            respuesta = JSONObject.quote("No fue posible ejecutar el envío SMS. Error: " + ex.getMessage());
        }

        return respuesta;
    }
}