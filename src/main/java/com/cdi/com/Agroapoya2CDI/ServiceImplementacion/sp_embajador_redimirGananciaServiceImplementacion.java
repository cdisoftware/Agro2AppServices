
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.sp_embajador_redimirGananciaEntity;
import com.cdi.com.Agroapoya2CDI.Services.sp_embajador_redimirGananciaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class sp_embajador_redimirGananciaServiceImplementacion implements sp_embajador_redimirGananciaService {

    @PersistenceContext
    private EntityManager repositorio;
    
    @Override
    public String RedimeGanancia(sp_embajador_redimirGananciaEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery actPregunt = repositorio.createNamedStoredProcedureQuery("sp_embajador_redimirGanancia");
            actPregunt.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("idPago", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("usucodigVecino", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("usucodigEmbajador", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("TipoPago", String.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("llavePago", String.class, ParameterMode.IN);

            actPregunt.setParameter("Bandera", Bandera);
            actPregunt.setParameter("idPago", entidad.getIdPago());
            actPregunt.setParameter("usucodigVecino", entidad.getUsucodigVecino());
            actPregunt.setParameter("usucodigEmbajador", entidad.getUsucodigEmbajador());
            actPregunt.setParameter("TipoPago", entidad.getTipoPago());
            actPregunt.setParameter("llavePago", entidad.getLlavePago());

            actPregunt.execute();
            return JSONObject.quote((String) actPregunt.getOutputParameterValue("Resultado"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (sp_embajador_redimirGanancia)"
                    + " - Parametros:" + Bandera + entidad
                    + " - ERROR JAVA = " + ex);
        }
    }
    
}
