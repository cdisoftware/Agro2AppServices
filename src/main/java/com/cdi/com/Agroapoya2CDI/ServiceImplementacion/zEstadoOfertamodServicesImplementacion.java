package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zEstadoOfertamodEntity;
import com.cdi.com.Agroapoya2CDI.Services.zEstadoOfertamodServices;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zEstadoOfertamodServicesImplementacion implements zEstadoOfertamodServices {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modEstadoOferta(Integer Bandera, zEstadoOfertamodEntity Entidad) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_EstadoOferta_mod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Parametro", String.class, ParameterMode.IN);
            
            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdOferta", Entidad.getIdOferta());
            parametros.setParameter("Estado", Entidad.getEstado());
            parametros.setParameter("Parametro", Entidad.getParametro());
            
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (AGRO_PREGUNTAMOD)"
                    + " - Parametros: " + Bandera + "/" + Entidad.getIdOferta() + "/" + Entidad.getEstado() + "/" + Entidad.getParametro()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
