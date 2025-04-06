package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zTipoRegaloReglajeConsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zTipoRegaloReglajeConsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zTipoRegaloReglajeConsServiceImplementacion implements zTipoRegaloReglajeConsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zTipoRegaloReglajeConsEntity> consTipoRegaloReglaje(Integer Bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_TipoRegaloReglaje_Cons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            
            tpoDoc.setParameter("Bandera", Bandera);
            
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_TipoRegaloReglaje_Cons)"
                    + " - Parametros: " + Bandera + "/"
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
