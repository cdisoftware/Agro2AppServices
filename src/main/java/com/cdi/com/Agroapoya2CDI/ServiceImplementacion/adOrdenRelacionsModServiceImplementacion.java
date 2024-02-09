package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adOrdenRelacionsModEntity;
import com.cdi.com.Agroapoya2CDI.Services.adOrdenRelacionsModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adOrdenRelacionsModServiceImplementacion implements adOrdenRelacionsModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAdminOrdenRelacion(adOrdenRelacionsModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("admin_OrdenRelacionsMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("CadenaOrden", String.class, ParameterMode.IN);
            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("CadenaOrden", entidad.getCadenaOrden());
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_OrdenRelacionsMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getCadenaOrden()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
