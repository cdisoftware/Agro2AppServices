package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adofertaFechasModEntity;
import com.cdi.com.Agroapoya2CDI.Services.adofertaFechasModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adofertaFechasModServiceImplementacion implements adofertaFechasModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAdminOfertaFechas(adofertaFechasModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("admin_ofertaFechasMod");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("cd_cnsctvo", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("FechaInicio", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("FechaFin", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("FechaEntrega", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("FechaPartida", String.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("cd_cnsctvo", entidad.getCd_cnsctvo());
            modRespuesta.setParameter("IdSector", entidad.getIdSector());
            modRespuesta.setParameter("FechaInicio", entidad.getFechaInicio());
            modRespuesta.setParameter("FechaFin", entidad.getFechaFin());
            modRespuesta.setParameter("FechaEntrega", entidad.getFechaEntrega());
            modRespuesta.setParameter("FechaPartida", entidad.getFechaPartida());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia: " + ex);
        }
    }

}
