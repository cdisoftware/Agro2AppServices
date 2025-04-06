package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zTipoPresentacionconsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zTipoPresentacionconsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zTipoPresentacionconsServiceImplementacion implements zTipoPresentacionconsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zTipoPresentacionconsEntity> consTipoPresentacion(Integer Bandera, String Parametro) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_TipoPresentacion_cons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Parametro", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Parametro", Parametro);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_TipoPresentacion_cons)"
                    + " - Parametros: " + Bandera + "/" + Parametro
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
