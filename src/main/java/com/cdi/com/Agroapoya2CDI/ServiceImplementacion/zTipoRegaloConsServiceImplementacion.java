package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zTipoRegaloConsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zTipoRegaloConsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zTipoRegaloConsServiceImplementacion implements zTipoRegaloConsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zTipoRegaloConsEntity> consTipoRegalo(Integer Bandera) {
                try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_TipoRegalo_Cons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("Bandera", Bandera);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();           
            list.add(0, JSONObject.quote("ERROR LOG (z_TipoRegalo_Cons)"
                    + " - Parametros: " + Bandera
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
