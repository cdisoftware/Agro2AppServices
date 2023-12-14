package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adProdVerPrimeroModEntity;
import com.cdi.com.Agroapoya2CDI.Services.adProdVerPrimeroModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adProdVerPrimeroModServiceImplementacion implements adProdVerPrimeroModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAdProdVerPrimero(adProdVerPrimeroModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("admin_ProdVerPrimeroMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Ancla", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdProducto", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Cd_cnsctvo", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("Ancla", entidad.getAncla());
            parametros.setParameter("IdProducto", entidad.getIdProducto());
            parametros.setParameter("Cd_cnsctvo", entidad.getCd_cnsctvo());
            parametros.setParameter("Id_Sector", entidad.getId_Sector());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Repuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_ProdVerPrimeroMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getAncla() + "/" + entidad.getIdProducto()
                    + "/" + entidad.getCd_cnsctvo() + "/" + entidad.getId_Sector()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
