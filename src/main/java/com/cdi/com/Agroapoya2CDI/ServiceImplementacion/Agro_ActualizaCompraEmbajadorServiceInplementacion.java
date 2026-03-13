package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.Agro_ActualizaCompraEmbajadorEntity;
import com.cdi.com.Agroapoya2CDI.Services.Agro_ActualizaCompraEmbajadorService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class Agro_ActualizaCompraEmbajadorServiceInplementacion implements Agro_ActualizaCompraEmbajadorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCompraEmbajador(Agro_ActualizaCompraEmbajadorEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery actPregunt = repositorio.createNamedStoredProcedureQuery("Agro_ActualizaCompraEmbajador");
            actPregunt.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("idCarro", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("IdGrupoEmbajador", String.class, ParameterMode.IN);

            actPregunt.setParameter("Bandera", Bandera);
            actPregunt.setParameter("idCarro", entidad.getIdCarro());
            actPregunt.setParameter("usucodig", entidad.getUsucodig());
            actPregunt.setParameter("IdGrupoEmbajador", entidad.getIdGrupoEmbajador());

            actPregunt.execute();
            return JSONObject.quote((String) actPregunt.getOutputParameterValue("Resultado"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (Agro_ActualizaCompraEmbajador)"
                    + " - Parametros:" + Bandera + entidad
                    + " - ERROR JAVA = " + ex);
        }
    }

}
