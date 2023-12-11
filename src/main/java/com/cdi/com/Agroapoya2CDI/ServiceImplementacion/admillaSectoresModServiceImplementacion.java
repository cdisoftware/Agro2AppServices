package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.admillaSectoresModEntity;
import com.cdi.com.Agroapoya2CDI.Services.admillaSectoresModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class admillaSectoresModServiceImplementacion implements admillaSectoresModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAdminSectors(admillaSectoresModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("admin_millaSectoresMod");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdSectorMilla", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("NombreSector", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("cd_rgion", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("cd_mncpio", String.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("IdSectorMilla", entidad.getIdSectorMilla());
            modRespuesta.setParameter("NombreSector", entidad.getNombreSector());
            modRespuesta.setParameter("cd_rgion", entidad.getCd_rgion());
            modRespuesta.setParameter("cd_mncpio", entidad.getCd_mncpio());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_millaSectoresMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdSectorMilla() + "/" + entidad.getNombreSector() + "/"
                    + entidad.getCd_rgion() + "/" + entidad.getCd_mncpio()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
