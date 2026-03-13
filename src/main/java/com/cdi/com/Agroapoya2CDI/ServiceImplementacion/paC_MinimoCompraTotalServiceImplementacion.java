
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.paC_MinimoCompraTotalEntity;
import com.cdi.com.Agroapoya2CDI.Services.paC_MinimoCompraTotalService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class paC_MinimoCompraTotalServiceImplementacion implements paC_MinimoCompraTotalService {

    @PersistenceContext
    private EntityManager repositorio;
    
    @Override
    public List<paC_MinimoCompraTotalEntity> ConsultaCompras(Integer Bandera, Integer Id, Integer Consecutivo) {
        try {
            StoredProcedureQuery Relacion = repositorio.createNamedStoredProcedureQuery("paC_MinimoCompraTotal_Const");
            Relacion.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            Relacion.registerStoredProcedureParameter("Id", Integer.class, ParameterMode.IN);
            Relacion.registerStoredProcedureParameter("cd_cnsctvo", Integer.class, ParameterMode.IN);
            Relacion.setParameter("Bandera", Bandera);
            Relacion.setParameter("Id", Id);
            Relacion.setParameter("cd_cnsctvo", Consecutivo);
            return Relacion.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_MinimoCompraTotal_Const)"
                    + " - Parametros: " + Bandera
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
    
}
