package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAsignaBodegaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAsignaBodegaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAsignaBodegaModServiceImplementacion implements CAsignaBodegaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCAsignaBodega(CAsignaBodegaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery SqlService = repositorio.createNamedStoredProcedureQuery("paC_AsignaBodegaMod");
            SqlService.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("IdDescarga", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("cd_cnctvo", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("IdBodega", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("IdTran", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);

            SqlService.setParameter("Bandera", Bandera);
            SqlService.setParameter("IdDescarga", entidad.getIdDescarga());
            SqlService.setParameter("cd_cnctvo", entidad.getCd_cnctvo());
            SqlService.setParameter("IdBodega", entidad.getIdBodega());
            SqlService.setParameter("IdTran", entidad.getIdTran());
            SqlService.setParameter("IdSector", entidad.getIdSector());
            SqlService.setParameter("Observacion", entidad.getObservacion());

            SqlService.execute();
            return JSONObject.quote((String) SqlService.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_AsignaBodegaMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdDescarga() + "/" + entidad.getCd_cnctvo() + "/" + entidad.getIdBodega()
                    + "/" + entidad.getIdTran() + "/" + entidad.getIdSector() + "/" + entidad.getObservacion()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
