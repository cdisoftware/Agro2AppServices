package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CdescargasTransEntity;
import com.cdi.com.Agroapoya2CDI.Services.CdescargasTranService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CdescargasTranServiceImplementacion implements CdescargasTranService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CdescargasTransEntity> ConsultaCDescargasTrans(Integer Bandera, Integer cd_cnctvo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_descargasTrans");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnctvo", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("cd_cnctvo", cd_cnctvo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_descargasTrans)"
                    + " - Parametros: " + Bandera + "/" + cd_cnctvo
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
