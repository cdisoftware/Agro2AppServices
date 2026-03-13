package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.sp_ActualizarConjuntoEmbajadorEntity;
import com.cdi.com.Agroapoya2CDI.Services.sp_ActualizarConjuntoEmbajadorService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
@Service
public class sp_ActualizarConjuntoEmbajadorServiceImplementacion implements sp_ActualizarConjuntoEmbajadorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModConjuntoEmbajador(sp_ActualizarConjuntoEmbajadorEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery actPregunt = repositorio.createNamedStoredProcedureQuery("sp_ActualizarConjuntoEmbajador");
            actPregunt.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("IdEmbajador", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("NombreConjunto", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("IdTipoEmbajador", Integer.class, ParameterMode.IN);

            actPregunt.setParameter("Bandera", Bandera);
            actPregunt.setParameter("IdEmbajador", entidad.getIdEmbajador());
            actPregunt.setParameter("NombreConjunto", entidad.getNombreConjunto());
            actPregunt.setParameter("IdTipoEmbajador", entidad.getIdEmbajador());

            actPregunt.execute();
            return JSONObject.quote((String) actPregunt.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (sp_ActualizarConjuntoEmbajador)"
                    + " - Parametros:" + Bandera + entidad
                    + " - ERROR JAVA = " + ex);
        }
    }

}
