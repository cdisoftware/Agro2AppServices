package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ztipoproductomodEntity;
import com.cdi.com.Agroapoya2CDI.Services.ztipoproductomodService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ztipoproductomodServiceImplementacion implements ztipoproductomodService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modTipoProducto(ztipoproductomodEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_tipoproducto_mod");

            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdTipo", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("DescripcionLarga", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("DescripcionCorta", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Prefijo", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoEstado", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoVentaProducto", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("UsucodigProd", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdTipo", entidad.getIdTipo());
            parametros.setParameter("Nombre", entidad.getNombre());
            parametros.setParameter("DescripcionLarga", entidad.getDescripcionLarga());
            parametros.setParameter("DescripcionCorta", entidad.getDescripcionCorta());
            parametros.setParameter("Prefijo", entidad.getPrefijo());
            parametros.setParameter("TipoEstado", entidad.getTipoEstado());
            parametros.setParameter("TipoVentaProducto", entidad.getTipoVentaProducto());
            parametros.setParameter("UsucodigProd", entidad.getUsucodigProd());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_tipoproducto_mod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdTipo() + "/" + entidad.getNombre() + "/" + entidad.getDescripcionLarga() + "/" + entidad.getDescripcionCorta() + "/"
                    + entidad.getPrefijo() + "/" + entidad.getTipoEstado() + "/" + entidad.getTipoVentaProducto() + "/" + entidad.getUsucodigProd()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
