package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adProductoLinksModEntity;
import com.cdi.com.Agroapoya2CDI.Services.adProductoLinksModservice;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adProductoLinksModServiceImplementacion implements adProductoLinksModservice {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAdProductoLinks(adProductoLinksModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("admin_ProductoLinksMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdLinkProducto", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("cd_prdcto", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Link", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoLink", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdLinkProducto", entidad.getIdLinkProducto());
            parametros.setParameter("cd_prdcto", entidad.getCd_prdcto());
            parametros.setParameter("Descripcion", entidad.getDescripcion());
            parametros.setParameter("Link", entidad.getLink());
            parametros.setParameter("TipoLink", entidad.getTipoLink());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_ProductoLinksMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdLinkProducto() + "/"
                    + entidad.getCd_prdcto() + "/" + entidad.getDescripcion() + "/" + entidad.getLink()
                    + "/" + entidad.getTipoLink()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
