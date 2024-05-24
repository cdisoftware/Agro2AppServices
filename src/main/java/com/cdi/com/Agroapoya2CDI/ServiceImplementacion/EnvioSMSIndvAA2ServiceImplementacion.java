package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.EnvioSMSIndvAA2Entity;
import com.cdi.com.Agroapoya2CDI.Services.EnvioSMSIndvAA2Service;
import org.json.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnvioSMSIndvAA2ServiceImplementacion implements EnvioSMSIndvAA2Service {

    @Override
    public String EnvioSMSIndvAA2(EnvioSMSIndvAA2Entity entidad) {
        String Respuesta = "";
        String user = "cdiamazonws@gmail.com";
        String token = "x86ad3ce6oprr9b382xma";
        String metodoEnvio = "1via";
        try {
            RestTemplate restTemplate = new RestTemplate();
       
            ResponseEntity<String> response = restTemplate.exchange("https://contacto-masivo.com/sms/back_sms/public/api/sendsms?user=" + user + "&token=" + 
            token + "&GSM=" + entidad.getTelefono() + "&SMSText=" + entidad.getMensaje() + "&metodo_envio=" + metodoEnvio, HttpMethod.POST, null, String.class);
            
            String responseBody = response.getBody();

            // Extraer el valor después de la coma y eliminar el <br>
            String[] parts = responseBody.split(",");
            if (parts.length > 1) {
                String status = parts[1].replace("<br>", "").trim();
                
                // Asignar mensaje basado en el valor de status
                switch (status) {
                    case "-4":
                        Respuesta = JSONObject.quote("El número no cumple con la cantidad de caracteres.");
                        break;
                    case "0":
                        Respuesta = JSONObject.quote("El operador no existe.");
                        break;
                    case "-3":
                        Respuesta = JSONObject.quote("No hay saldo suficiente para eL envío de sms.");
                        break;
                    default:
                        Respuesta = JSONObject.quote("Mensaje enviado correctamente.");
                        break;
                }
            } else {
                Respuesta = JSONObject.quote("Respuesta inesperada del microservicio envio SMS.");
            }
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos: Error " + ex.getMessage());
        }
        return Respuesta;
    }
}