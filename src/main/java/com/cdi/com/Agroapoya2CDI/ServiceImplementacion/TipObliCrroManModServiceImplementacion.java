package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.TipObliCrroManModEntity;
import com.cdi.com.Agroapoya2CDI.Services.TipObliCrroManModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class TipObliCrroManModServiceImplementacion implements TipObliCrroManModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCorreoManual(TipObliCrroManModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modCorreoMan = repositorio.createNamedStoredProcedureQuery("Agro_TipObliCorreoManualMod");
            modCorreoMan.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modCorreoMan.registerStoredProcedureParameter("Id", Integer.class, ParameterMode.IN);
            modCorreoMan.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);

            modCorreoMan.setParameter("Bandera", Bandera);
            modCorreoMan.setParameter("Id", entidad.getId());
            modCorreoMan.setParameter("IdPlantilla", entidad.getIdPlantilla());

            modCorreoMan.execute();
            return JSONObject.quote((String) modCorreoMan.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (Agro_TipObliCorreoManualMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getId() + "/" + entidad.getIdPlantilla()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
