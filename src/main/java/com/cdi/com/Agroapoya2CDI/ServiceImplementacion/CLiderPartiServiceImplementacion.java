package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CLiderPartiEntity;
import com.cdi.com.Agroapoya2CDI.Services.CLiderPartiService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CLiderPartiServiceImplementacion implements CLiderPartiService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CLiderPartiEntity> ConsultaCLiderParticipante(Integer Bandera, Integer IdCarro) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_LiderParti");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdCarro", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdCarro", IdCarro);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_LiderParti)"
                    + " - Parametros: " + Bandera + "/" + IdCarro
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
