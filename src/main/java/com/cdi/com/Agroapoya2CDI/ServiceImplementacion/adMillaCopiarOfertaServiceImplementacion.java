package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adMillaCopiarOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.adMillaCopiarOfertaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adMillaCopiarOfertaServiceImplementacion implements adMillaCopiarOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String CopiaAdmillaOferta(adMillaCopiarOfertaEntity entidad) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("admin_millaCopiarOferta");
            modRespuesta.registerStoredProcedureParameter("CD_CNSCTVO", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("FechaRecoge", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("FechaDesde", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("FechaHasta", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("FechaEntrega", String.class, ParameterMode.IN);

            modRespuesta.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            modRespuesta.setParameter("FechaRecoge", entidad.getFechaRecoge());
            modRespuesta.setParameter("FechaDesde", entidad.getFechaDesde());
            modRespuesta.setParameter("FechaHasta", entidad.getFechaHasta());
            modRespuesta.setParameter("FechaEntrega", entidad.getFechaEntrega());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia: " + ex);
        }
    }

}
