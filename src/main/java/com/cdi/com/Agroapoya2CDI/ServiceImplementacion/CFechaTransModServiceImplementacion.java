package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CFechaTransModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CFechaTransModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CFechaTransModServiceImplementacion implements CFechaTransModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCFechaTras(CFechaTransModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("paC_FechaTransMod");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Cd_cnsctivo", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdSecotor", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("FechaActualizar", String.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("Cd_cnsctivo", entidad.getCd_cnsctivo());
            modRespuesta.setParameter("IdSecotor", entidad.getIdSecotor());
            modRespuesta.setParameter("IdGrupo", entidad.getIdGrupo());
            modRespuesta.setParameter("FechaActualizar", entidad.getFechaActualizar());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_FechaTransMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getCd_cnsctivo() + "/" + entidad.getIdSecotor()
                    + "/" + entidad.getIdGrupo() + "/" + entidad.getFechaActualizar()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
