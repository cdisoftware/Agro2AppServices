package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CMisToppingsEntity;
import com.cdi.com.Agroapoya2CDI.Services.CMisToppingsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CMisToppingsServiceImplementacion implements CMisToppingsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CMisToppingsEntity> ConsultaCMisToppings(Integer Bandera, Integer IdCliente) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_MisToppings");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdCliente", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdCliente", IdCliente);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_MisToppings)"
                    + " - Parametros: " + Bandera + "/" + IdCliente
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
