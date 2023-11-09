package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adcoordenadasMillaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.adcoordenadasMillaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adcoordenadasMillaModServiceImplementacion implements adcoordenadasMillaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAdminCoordMilla(adcoordenadasMillaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("admin_coordenadasMillaMod");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("ID", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("ID_SCTOR_MILLA", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("LTTUD", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("LNGTUD", String.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("ID", entidad.getID());
            modRespuesta.setParameter("ID_SCTOR_MILLA", entidad.getID_SCTOR_MILLA());
            modRespuesta.setParameter("LTTUD", entidad.getLTTUD());
            modRespuesta.setParameter("LNGTUD", entidad.getLNGTUD());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia: " + ex);
        }
    }

}
