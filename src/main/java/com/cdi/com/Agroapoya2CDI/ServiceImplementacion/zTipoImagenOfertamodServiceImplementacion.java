package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zTipoImagenOfertamodEntity;
import com.cdi.com.Agroapoya2CDI.Services.zTipoImagenOfertamodService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zTipoImagenOfertamodServiceImplementacion implements zTipoImagenOfertamodService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modTipoImagenOferta(zTipoImagenOfertamodEntity entidad, Integer Bandedera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_TipoImagenOferta_mod");
            parametros.registerStoredProcedureParameter("Bandedera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdImagen", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdProducto", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Orden", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoEstado", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandedera", Bandedera);
            parametros.setParameter("IdImagen", entidad.getIdImagen());
            parametros.setParameter("IdProducto", entidad.getIdProducto());
            parametros.setParameter("Nombre", entidad.getNombre());
            parametros.setParameter("Orden", entidad.getOrden());
            parametros.setParameter("TipoEstado", entidad.getTipoEstado());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (AGRO_PREGUNTAMOD)"
                    + " - Parametros: " + Bandedera + "/" + entidad.getIdImagen()+ "/" + entidad.getIdProducto() + "/" + entidad.getNombre() + "/" + entidad.getOrden() + "/" + entidad.getTipoEstado()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
