package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Comun.clsEncriptacion;
import com.cdi.com.Agroapoya2CDI.Entity.EncriptacionEntity;
import com.cdi.com.Agroapoya2CDI.Services.EncriptacionService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class EncriptacionServiceImplementacion implements EncriptacionService {

    @Override
    public String Clave(EncriptacionEntity entidad) {
        String Respuesta = null;

        if (entidad.getBandera() == 1) {
            try {
                String encripta = clsEncriptacion.Encriptar(entidad.getClave());
                Respuesta = encripta;
            } catch (IllegalBlockSizeException | NoSuchPaddingException | BadPaddingException ex) {
                Logger.getLogger(EncriptacionServiceImplementacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            String desencripta = clsEncriptacion.Desencriptar(entidad.getClave());
            Respuesta = desencripta;
        }
        return JSONObject.quote(Respuesta);
    }

}
