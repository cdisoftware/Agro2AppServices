package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CRelacionLiderPartiEntity;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionLiderPartiService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CRelacionLiderPartiServiceImplementacion implements CRelacionLiderPartiService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CRelacionLiderPartiEntity> ConsRelacionLiderPart(Integer Bandera, Integer IdCarroLider) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("paC_RelacionLiderParti");
            respu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("IdCarroLider", Integer.class, ParameterMode.IN);

            respu.setParameter("Bandera", Bandera);
            respu.setParameter("IdCarroLider", IdCarroLider);

            return respu.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
             list.add(0, JSONObject.quote("ERROR LOG (paC_RelacionLiderParti)"
                    + " - Parametros: " + Bandera + "/" + IdCarroLider
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}

