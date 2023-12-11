package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroRespuestasEncuestaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAgroRespuestasEncuestaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAgroRespuestasEncuestaModServiceImplementacion implements CAgroRespuestasEncuestaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCAgroRespEncsta(CAgroRespuestasEncuestaModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("paCAgro_Respuestas_Encuesta_Mod");
            respu.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("ID_CLNTE", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("ID_PRGNTA_OFR", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("CD_TPO_PRGNTA", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("RESPUESTA_PRG", String.class, ParameterMode.IN);
            respu.setParameter("bandera", bandera);
            respu.setParameter("ID_CLNTE", entidad.getID_CLNTE());
            respu.setParameter("ID_PRGNTA_OFR", entidad.getID_PRGNTA_OFR());
            respu.setParameter("CD_TPO_PRGNTA", entidad.getCD_TPO_PRGNTA());
            respu.setParameter("RESPUESTA_PRG", entidad.getRESPUESTA_PRG());
            respu.execute();
            return JSONObject.quote((String) respu.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paCAgro_Respuestas_Encuesta_Mod)"
                    + " - Parametros: " + bandera + "/" + entidad.getID_CLNTE() + "/" + entidad.getID_PRGNTA_OFR() + "/" + entidad.getCD_TPO_PRGNTA() + "/" + entidad.getRESPUESTA_PRG()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
