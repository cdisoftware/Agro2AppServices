package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zTipoPresentacionmodEntity;
import com.cdi.com.Agroapoya2CDI.Services.zTipoPresentacionmodService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zTipoPresentacionmodServiceImplementacion implements zTipoPresentacionmodService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modTipoPresentacion(Integer Bandera, zTipoPresentacionmodEntity Entidad) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_TipoPresentacion_mod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoPesoUnidades", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Peso", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Unidades", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoEstado", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("Descripcion", Entidad.getDescripcion());
            parametros.setParameter("TipoPesoUnidades", Entidad.getTipoPesoUnidades());
            parametros.setParameter("Peso", Entidad.getPeso());
            parametros.setParameter("Unidades", Entidad.getUnidades());
            parametros.setParameter("TipoEstado", Entidad.getTipoEstado());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (AGRO_PREGUNTAMOD)"
                    + " - Parametros: " + Bandera + "/" + Entidad.getDescripcion() + "/" + Entidad.getTipoPesoUnidades() + "/" + Entidad.getPeso() + "/" +  Entidad.getUnidades() + "/" + Entidad.getTipoEstado()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
