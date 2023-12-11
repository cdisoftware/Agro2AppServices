package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.SmsItCloudEntity;
import com.cdi.com.Agroapoya2CDI.Services.SmsItCloudService;
import org.json.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SmsItCloudServiceImplementacion implements SmsItCloudService {

    String Respuesta;

    @Override
    public String EnvioSmsItCloud(SmsItCloudEntity entidad) {

        try {
            RestTemplate rt = new RestTemplate();
            ResponseEntity<String> response = rt.exchange("https://contacto-masivo.com/sms/back_sms/public/api/sendsms?user=" + entidad.getUser() + "&token=" + entidad.getToken() + "&GSM=" + entidad.getGSM() + "&SMSText=" + entidad.getSMSText() + "&metodo_envio=" + entidad.getMetodo_envio(), HttpMethod.POST, null, String.class);
            Respuesta = JSONObject.quote("SMS Enviado Correctamente");
        } catch (Exception ex) {
            return "Error envio de SMS:" + ex.getMessage();
        }
        return Respuesta;
    }
}
