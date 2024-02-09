package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CtorUltMillaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CtorUltMillaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CtorUltMillaModServiceImplementacion implements CtorUltMillaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCtorUltMilla(CtorUltMillaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery SqlService = repositorio.createNamedStoredProcedureQuery("paC_ConductorUltimaMuillaMod");
            SqlService.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("cd_cnsctivo", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("idSector", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("idConductor", Integer.class, ParameterMode.IN);

            SqlService.setParameter("Bandera", Bandera);
            SqlService.setParameter("IdGrupo", entidad.getIdGrupo());
            SqlService.setParameter("cd_cnsctivo", entidad.getCd_cnsctivo());
            SqlService.setParameter("idSector", entidad.getIdSector());
            SqlService.setParameter("idConductor", entidad.getIdConductor());

            SqlService.execute();
            return JSONObject.quote((String) SqlService.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_ConductorUltimaMuillaMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdGrupo() + "/" + entidad.getCd_cnsctivo() + "/"
                    + entidad.getIdSector() + "/" + entidad.getIdConductor()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
