package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.AestadoOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.AestadoOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class AestadoOfertaModServiceImplementacion implements AestadoOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String AEstadoOfertaMod(AestadoOfertaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("paA_estadoOfertaMod");
            respu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("cnctivoOferta", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("descripcion", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("estado", Integer.class, ParameterMode.IN);
            respu.setParameter("Bandera", Bandera);
            respu.setParameter("usucodig", entidad.getUsucodig());
            respu.setParameter("cnctivoOferta", entidad.getCnctivoOferta());
            respu.setParameter("descripcion", entidad.getDescripcion());
            respu.setParameter("estado", entidad.getEstado());
            respu.execute();
            return JSONObject.quote((String) respu.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paA_estadoOfertaMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getUsucodig() + "/" + entidad.getCnctivoOferta() + "/" + entidad.getDescripcion() + "/" + entidad.getEstado()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
