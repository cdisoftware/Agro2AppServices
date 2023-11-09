package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.AdminMillaTransporteModEntity;
import com.cdi.com.Agroapoya2CDI.Services.AdminMillaTransporteModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class AdminMillaTransporteModServiceImplementacion implements AdminMillaTransporteModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAdminMillaTransporte(AdminMillaTransporteModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("admin_MillaTransporteMod");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdGrupoMilla", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("ValorFlete", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("FechaEntrega", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("UbicacionEntrega", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("UbicacionRecoge", String.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("IdGrupoMilla", entidad.getIdGrupoMilla());
            modRespuesta.setParameter("ValorFlete", entidad.getValorFlete());
            modRespuesta.setParameter("FechaEntrega", entidad.getFechaEntrega());
            modRespuesta.setParameter("UbicacionEntrega", entidad.getUbicacionEntrega());
            modRespuesta.setParameter("UbicacionRecoge", entidad.getUbicacionRecoge());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia: " + ex);
        }
    }

}