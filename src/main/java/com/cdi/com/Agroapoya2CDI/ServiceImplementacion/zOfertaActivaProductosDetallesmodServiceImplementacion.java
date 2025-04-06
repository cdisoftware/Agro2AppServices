package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zOfertaActivaProductosDetallesmodEntity;
import com.cdi.com.Agroapoya2CDI.Services.zOfertaActivaProductosDetallesmodService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zOfertaActivaProductosDetallesmodServiceImplementacion implements zOfertaActivaProductosDetallesmodService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modOfertaActivaProductosDetalles(zOfertaActivaProductosDetallesmodEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_OfertaActivaProductosDetalles_mod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdProducto", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoPresentacion", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("ValorReal", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("ValorReferencia", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("UnidadesDisponibles", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("MaximoUnidades", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Orden", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoEstado", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdOferta", entidad.getIdOferta());
            parametros.setParameter("IdProducto", entidad.getIdProducto());
            parametros.setParameter("TipoPresentacion", entidad.getTipoPresentacion());
            parametros.setParameter("ValorReal", entidad.getValorReal());
            parametros.setParameter("ValorReferencia", entidad.getValorReferencia());
            parametros.setParameter("UnidadesDisponibles", entidad.getUnidadesDisponibles());
            parametros.setParameter("MaximoUnidades", entidad.getMaximoUnidades());
            parametros.setParameter("Orden", entidad.getOrden());
            parametros.setParameter("TipoEstado", entidad.getTipoEstado());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));

        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_OfertaActivaProductosDetalles_mod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdOferta() + "/" + entidad.getIdProducto()  + "/" +  entidad.getTipoPresentacion()
                    + "/" + entidad.getValorReal() + "/" + entidad.getValorReferencia() + "/" + entidad.getUnidadesDisponibles() + "/" + entidad.getMaximoUnidades() + "/" + 
                    entidad.getOrden() + "/" + entidad.getTipoEstado()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
