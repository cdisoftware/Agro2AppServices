
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.paC_MinimoCompraTotalModEntity;
import com.cdi.com.Agroapoya2CDI.Services.paC_MinimoCompraTotalModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class paC_MinimoCompraTotalModServiceImplementacion implements paC_MinimoCompraTotalModService {

    @PersistenceContext
    private EntityManager repositorio;
    
    @Override
    public String ModMinimoCompraTotal(paC_MinimoCompraTotalModEntity entidad, Integer Bandera) {
       try {
            StoredProcedureQuery actPregunt = repositorio.createNamedStoredProcedureQuery("paC_MinimoCompraTotalMod");
            actPregunt.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("Id", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("IdTipo", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("PesoLibras", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("NumCompras", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("cd_cnsctivo", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            actPregunt.setParameter("Bandera", Bandera);
            actPregunt.setParameter("Id", entidad.getId());
            actPregunt.setParameter("IdTipo", entidad.getIdTipo());
            actPregunt.setParameter("PesoLibras", entidad.getPesoLibras());
            actPregunt.setParameter("NumCompras", entidad.getNumCompras());
            actPregunt.setParameter("Estado", entidad.getEstado());
            actPregunt.setParameter("cd_cnsctivo", entidad.getCd_cnsctivo());
            actPregunt.setParameter("Descripcion", entidad.getDescripcion());
            actPregunt.execute();
            return JSONObject.quote((String) actPregunt.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_MinimoCompraTotalMod)"
                    + " - Parametros:" + Bandera + entidad
                    + " - ERROR JAVA = " + ex);
        }
    }
    
}
