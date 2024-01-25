package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adproducTransEntity;
import com.cdi.com.Agroapoya2CDI.Services.adproducTranService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adproducTranServiceImplementacion implements adproducTranService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adproducTransEntity> ConsultaAdProductTrans(Integer Bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_productosTrans");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("Bandera", Bandera);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (admin_productosTrans)"
                    + " - Parametros: " + Bandera
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
