package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CActualizaIdManyChatEntity;
import com.cdi.com.Agroapoya2CDI.Services.CActualizaIdManyChatService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CActualizaIdManyChatServiceImplementacion implements CActualizaIdManyChatService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ActualizaIdManyChat(CActualizaIdManyChatEntity entidad, Integer BANDERA) {
        try {
            StoredProcedureQuery resp = repositorio.createNamedStoredProcedureQuery("paCActualizaIdManyChat");
            resp.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            resp.registerStoredProcedureParameter("correo_persona", String.class, ParameterMode.IN);
            resp.registerStoredProcedureParameter("ID_MANYCHAT", String.class, ParameterMode.IN);

            resp.setParameter("BANDERA", BANDERA);
            resp.setParameter("correo_persona", entidad.getCorreo_persona());
            resp.setParameter("ID_MANYCHAT", entidad.getID_MANYCHAT());

            resp.execute();
            return JSONObject.quote((String) resp.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
