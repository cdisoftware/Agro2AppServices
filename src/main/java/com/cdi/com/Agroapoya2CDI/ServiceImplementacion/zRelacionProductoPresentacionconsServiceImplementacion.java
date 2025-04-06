package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zRelacionProductoPresentacionconsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zRelacionProductoPresentacionconsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zRelacionProductoPresentacionconsServiceImplementacion implements zRelacionProductoPresentacionconsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zRelacionProductoPresentacionconsEntity> consRelacionProductoPresentacion(Integer Bandera, Integer IdProuducto) {
                try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_RelacionProductoPresentacion_cons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdProuducto", Integer.class, ParameterMode.IN);
            
            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdProuducto", IdProuducto);
            
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();           
            list.add(0, JSONObject.quote("ERROR LOG (z_RelacionProductoPresentacion_cons)"
                    + " - Parametros: " + Bandera + "/" + Bandera + "/" + IdProuducto
                    + " - ERROR JAVA = " + ex));
            return list;   
        }
    }
}
