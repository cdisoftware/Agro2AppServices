package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adMillaSectoresEntity;
import com.cdi.com.Agroapoya2CDI.Services.adMillaSectoreService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adMillaSectoreServiceImplementacion implements adMillaSectoreService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adMillaSectoresEntity> consultaAdMillaSectores(Integer Bandera, Integer IdSector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_MillaSectores");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdSector", IdSector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (admin_MillaSectores)"
                    + " - Parametros: " + Bandera + "/" + IdSector
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
