package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.listaTamanoEntity;
import com.cdi.com.Agroapoya2CDI.Services.listaTamanoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class listaTamanoServiceImplementacion implements listaTamanoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<listaTamanoEntity> ConsultaListaTamano(Integer producto) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paT_listaTamano");
            tpoDoc.registerStoredProcedureParameter("producto", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("producto", producto);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paT_listaTamano)"
                    + " - Parametros: " + producto
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
