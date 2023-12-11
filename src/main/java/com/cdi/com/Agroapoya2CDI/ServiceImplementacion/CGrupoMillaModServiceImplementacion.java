package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CGrupoMillaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CGrupoMillaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CGrupoMillaModServiceImplementacion implements CGrupoMillaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCGrupoMilla(CGrupoMillaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery SqlService = repositorio.createNamedStoredProcedureQuery("paC_GrupoMillaMod");
            SqlService.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("cd_csctvo", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            SqlService.setParameter("Bandera", Bandera);
            SqlService.setParameter("IdGrupo", entidad.getIdGrupo());
            SqlService.setParameter("cd_csctvo", entidad.getCd_csctvo());
            SqlService.setParameter("IdSector", entidad.getIdSector());

            SqlService.execute();
            return JSONObject.quote((String) SqlService.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_GrupoMillaMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdGrupo() + "/" + entidad.getCd_csctvo() + "/" + entidad.getIdSector()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
