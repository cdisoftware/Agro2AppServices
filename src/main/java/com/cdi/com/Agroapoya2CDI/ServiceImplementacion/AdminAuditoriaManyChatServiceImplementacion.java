package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.AdminAuditoriaManyChatEntity;
import com.cdi.com.Agroapoya2CDI.Services.AdminAuditoriaManyChatService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class AdminAuditoriaManyChatServiceImplementacion implements AdminAuditoriaManyChatService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String AuditoriaAdminManychat(AdminAuditoriaManyChatEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("Admin_AuditoriaManyChat");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("QueryPre", String.class, ParameterMode.IN);
            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("QueryPre", entidad.getQueryPre());
            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
