package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.admillaPoligonoModEntity;
import com.cdi.com.Agroapoya2CDI.Services.admillaPoligonoModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class admillaPoligonoModServiceImplementacion implements admillaPoligonoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAdMillaPoligono(admillaPoligonoModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("admin_millaPoligonoMod");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("ID_SCTOR", Integer.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("ID_SCTOR", entidad.getID_SCTOR());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_millaPoligonoMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getID_SCTOR()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
