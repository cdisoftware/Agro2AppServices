package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.COrdenUltimaMillaEntity;
import com.cdi.com.Agroapoya2CDI.Services.COrdenUltimaMillaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class COrdenUltimaMillaServiceImplementacion implements COrdenUltimaMillaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCOrdenUltimaMilla(COrdenUltimaMillaEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("paC_OrdenUltimaMilla");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("CadenaOrden", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Cd_cnsctivo", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("CadenaOrden", entidad.getCadenaOrden());
            modRespuesta.setParameter("IdGrupo", entidad.getIdGrupo());
            modRespuesta.setParameter("Cd_cnsctivo", entidad.getCd_cnsctivo());
            modRespuesta.setParameter("IdSector", entidad.getIdSector());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_OrdenUltimaMilla)"
                    + " - Parametros: " + Bandera + "/" + entidad.getCadenaOrden() + "/" + entidad.getIdGrupo() + "/"
                    + entidad.getCd_cnsctivo() + "/" + entidad.getIdSector()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
