package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CLincortoSpEntity;
import com.cdi.com.Agroapoya2CDI.Services.CLincortoSpService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CLincortoSpServiceImplementacion implements CLincortoSpService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String LinkCortoSp(CLincortoSpEntity entidad, Integer BANDERA) {
        try {
            StoredProcedureQuery link = repositorio.createNamedStoredProcedureQuery("paC_LincortoSp");
            link.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            link.registerStoredProcedureParameter("IdCarro", Integer.class, ParameterMode.IN);
            link.setParameter("BANDERA", BANDERA);
            link.setParameter("IdCarro", entidad.getIdCarro());
            link.execute();
            return JSONObject.quote((String) link.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_LincortoSp)"
                    + " - Parametros: " + BANDERA + "/" + entidad.getIdCarro()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
