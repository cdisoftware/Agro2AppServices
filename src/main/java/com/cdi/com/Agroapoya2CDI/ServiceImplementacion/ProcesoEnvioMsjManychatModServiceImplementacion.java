package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ProcesoEnvioMsjManychatModEntity;
import com.cdi.com.Agroapoya2CDI.Services.ProcesoEnvioMsjManychatModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ProcesoEnvioMsjManychatModServiceImplementacion implements ProcesoEnvioMsjManychatModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModProcesoEnvioManychat(ProcesoEnvioMsjManychatModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery sql = repositorio.createNamedStoredProcedureQuery("paC_LogsEnvioMsjManychatMod");
            sql.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            sql.registerStoredProcedureParameter("id_proceso", Integer.class, ParameterMode.IN);
            sql.registerStoredProcedureParameter("sql_proceso", String.class, ParameterMode.IN);
            sql.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            sql.registerStoredProcedureParameter("usucodig_msj", Integer.class, ParameterMode.IN);
            sql.registerStoredProcedureParameter("celular", String.class, ParameterMode.IN);
            sql.registerStoredProcedureParameter("id_manychat", String.class, ParameterMode.IN);
            sql.registerStoredProcedureParameter("mensaje", String.class, ParameterMode.IN);

            sql.setParameter("bandera", bandera);
            sql.setParameter("id_proceso", entidad.getId_proceso());
            sql.setParameter("sql_proceso", entidad.getSql_proceso());
            sql.setParameter("usucodig", entidad.getUsucodig());
            sql.setParameter("usucodig_msj", entidad.getUsucodig_msj());
            sql.setParameter("celular", entidad.getCelular());
            sql.setParameter("id_manychat", entidad.getId_manychat());
            sql.setParameter("mensaje", entidad.getMensaje());

            sql.execute();
            return JSONObject.quote((String) sql.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
