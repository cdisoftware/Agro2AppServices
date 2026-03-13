package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.paC_MinimoCompraTotalRelacionModEntity;
import com.cdi.com.Agroapoya2CDI.Services.paC_MinimoCompraTotalRelacionModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class paC_MinimoCompraTotalRelacionModServiceImplementacion implements paC_MinimoCompraTotalRelacionModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModMinimoCompraRelacion(paC_MinimoCompraTotalRelacionModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery actPregunt = repositorio.createNamedStoredProcedureQuery("paC_MinimoCompraTotalRelacionMod");
            actPregunt.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("cd_cnsctivo", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("IdTipoRelacion	", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("DescripcionRelacion", String.class, ParameterMode.IN);
            actPregunt.setParameter("Bandera", Bandera);
            actPregunt.setParameter("cd_cnsctivo", entidad.getCd_cnsctivo());
            actPregunt.setParameter("IdTipoRelacion", entidad.getIdTipoRelacion());
            actPregunt.setParameter("DescripcionRelacion", entidad.getDescripcionRelacion());
            actPregunt.execute();
            return JSONObject.quote((String) actPregunt.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_MinimoCompraTotalRelacionMod)"
                    + " - Parametros:" + Bandera + "/" + entidad.getCd_cnsctivo() + "/" + entidad.getIdTipoRelacion()  + "/" + entidad.getDescripcionRelacion()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
