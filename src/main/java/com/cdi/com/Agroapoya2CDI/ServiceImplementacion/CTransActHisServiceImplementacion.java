package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTransActHisEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTransActHisService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTransActHisServiceImplementacion implements CTransActHisService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CTransActHisEntity> ConsCTransActHis(Integer bandera, Integer id_condutor, Integer usucodigTrans) {
        try {
            StoredProcedureQuery trans = repositorio.createNamedStoredProcedureQuery("paC_TransActivosHistorial");
            trans.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            trans.registerStoredProcedureParameter("id_condutor", Integer.class, ParameterMode.IN);
            trans.registerStoredProcedureParameter("usucodigTrans", Integer.class, ParameterMode.IN);

            trans.setParameter("bandera", bandera);
            trans.setParameter("id_condutor", id_condutor);
            trans.setParameter("usucodigTrans", usucodigTrans);

            return trans.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_TransActivosHistorial)"
                    + " - Parametros: " + bandera + "/" + id_condutor + "/" + usucodigTrans
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
