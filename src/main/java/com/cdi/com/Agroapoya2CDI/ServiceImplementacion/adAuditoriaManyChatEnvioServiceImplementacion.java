package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adAuditoriaManyChatEnvioEntity;
import com.cdi.com.Agroapoya2CDI.Services.adAuditoriaManyChatEnvioService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adAuditoriaManyChatEnvioServiceImplementacion implements adAuditoriaManyChatEnvioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String AuditoriaManychatEnviod(adAuditoriaManyChatEnvioEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("admin_AuditoriaManyChatEnvio");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdManyChat", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdAuditoria", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdTipoEnvio", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdManyChat", entidad.getIdManyChat());
            parametros.setParameter("Usucodig", entidad.getUsucodig());
            parametros.setParameter("IdAuditoria", entidad.getIdAuditoria());
            parametros.setParameter("IdTipoEnvio", entidad.getIdTipoEnvio());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_AuditoriaManyChatEnvio)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdManyChat()
                    + "/" + entidad.getUsucodig() + "/" + entidad.getIdAuditoria() + "/" + entidad.getIdTipoEnvio()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
