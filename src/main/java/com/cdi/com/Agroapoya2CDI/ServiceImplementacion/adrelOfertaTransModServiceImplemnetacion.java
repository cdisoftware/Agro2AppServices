package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adrelOfertaTransModEntity;
import com.cdi.com.Agroapoya2CDI.Services.adrelOfertaTransModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adrelOfertaTransModServiceImplemnetacion implements adrelOfertaTransModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAdRelacionTransporteOfert(adrelOfertaTransModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("admin_relacion_Oferta_Trans_Mod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdTrans", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdTipoProducto", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdProducto", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Cantidad", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("cd_cnsctvo", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdTrans", entidad.getIdTrans());
            parametros.setParameter("IdTipoProducto", entidad.getIdTipoProducto());
            parametros.setParameter("IdProducto", entidad.getIdProducto());
            parametros.setParameter("Cantidad", entidad.getCantidad());
            parametros.setParameter("cd_cnsctvo", entidad.getCd_cnsctvo());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_relacion_Oferta_Trans_Mod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdTrans()
                    + "/" + entidad.getIdTipoProducto() + "/" + entidad.getIdProducto() + "/" + entidad.getCantidad() + "/" + entidad.getCd_cnsctvo()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
