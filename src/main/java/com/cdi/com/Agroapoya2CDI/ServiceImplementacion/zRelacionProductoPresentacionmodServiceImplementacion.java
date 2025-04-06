package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zRelacionProductoPresentacionmodEntity;
import com.cdi.com.Agroapoya2CDI.Services.zRelacionProductoPresentacionmodService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zRelacionProductoPresentacionmodServiceImplementacion implements zRelacionProductoPresentacionmodService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modRelacionProductoPresentacion(Integer Bandera, zRelacionProductoPresentacionmodEntity Entidad) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_RelacionProductoPresentacion_mod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoPresentacion", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoProducto", Integer.class, ParameterMode.IN);
            
            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("TipoPresentacion", Entidad.getTipoPresentacion());
            parametros.setParameter("TipoProducto", Entidad.getTipoProducto());
            
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (AGRO_PREGUNTAMOD)"
                    + " - Parametros: " + Bandera + "/" + Entidad.getTipoPresentacion() + "/" + Entidad.getTipoProducto()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
