package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.cRelacionProdToppingModEntity;
import com.cdi.com.Agroapoya2CDI.Services.cRelacionProdToppingModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class cRelacionProdToppingModServiceImplementacion implements cRelacionProdToppingModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModRelacionProdTopping(cRelacionProdToppingModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("pac_RelacionProdToppingMod");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdTopping", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdRelacion", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Presentacion", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("ValorReal", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("ValorReferencia", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("UnidadesOferta", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("MximoUnidades", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("PesoUnidad", String.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("IdTopping", entidad.getIdTopping());
            modRespuesta.setParameter("IdRelacion", entidad.getIdRelacion());
            modRespuesta.setParameter("Presentacion", entidad.getPresentacion());
            modRespuesta.setParameter("ValorReal", entidad.getValorReal());
            modRespuesta.setParameter("ValorReferencia", entidad.getValorReferencia());
            modRespuesta.setParameter("UnidadesOferta", entidad.getUnidadesOferta());
            modRespuesta.setParameter("MximoUnidades", entidad.getMximoUnidades());
            modRespuesta.setParameter("Id_Sector", entidad.getId_Sector());
            modRespuesta.setParameter("PesoUnidad", entidad.getPesoUnidad());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (pac_RelacionProdToppingMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdTopping() + "/" + entidad.getIdRelacion() + "/"
                    + entidad.getPresentacion() + "/" + entidad.getValorReal() + "/" + entidad.getValorReferencia()
                    + "/" + entidad.getUnidadesOferta() + "/" + entidad.getMximoUnidades() + "/" + entidad.getId_Sector()
                    + "/" + entidad.getPesoUnidad()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
