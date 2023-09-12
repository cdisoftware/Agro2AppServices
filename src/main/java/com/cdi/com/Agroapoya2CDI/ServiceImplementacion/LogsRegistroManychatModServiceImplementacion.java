package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.LogsRegistroManychatModEntity;
import com.cdi.com.Agroapoya2CDI.Services.LogsRegistroManychatModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class LogsRegistroManychatModServiceImplementacion implements LogsRegistroManychatModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModLogsRegManychat(LogsRegistroManychatModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery modRegistro = repositorio.createNamedStoredProcedureQuery("paC_LogsRegistroManychatMod");
            modRegistro.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            modRegistro.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            modRegistro.registerStoredProcedureParameter("celular", String.class, ParameterMode.IN);
            modRegistro.registerStoredProcedureParameter("rta_manychat", String.class, ParameterMode.IN);
            modRegistro.registerStoredProcedureParameter("origen", Integer.class, ParameterMode.IN);

            modRegistro.setParameter("bandera", bandera);
            modRegistro.setParameter("usucodig", entidad.getUsucodig());
            modRegistro.setParameter("celular", entidad.getCelular());
            modRegistro.setParameter("rta_manychat", entidad.getRta_manychat());
            modRegistro.setParameter("origen", entidad.getOrigen());

            modRegistro.execute();
            return JSONObject.quote((String) modRegistro.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
