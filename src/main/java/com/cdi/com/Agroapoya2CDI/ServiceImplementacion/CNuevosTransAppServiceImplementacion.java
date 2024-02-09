package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CNuevosTransAppEntity;
import com.cdi.com.Agroapoya2CDI.Services.CNuevosTransAppService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CNuevosTransAppServiceImplementacion implements CNuevosTransAppService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CNuevosTransAppEntity> consultaCNewTransApp(Integer Bandera, Integer UsucodigTrans) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_NuevosTransApp");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("UsucodigTrans", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("UsucodigTrans", UsucodigTrans);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
             list.add(0, JSONObject.quote("ERROR LOG (paC_NuevosTransApp)"
                    + " - Parametros: " + Bandera + "/" + UsucodigTrans
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
