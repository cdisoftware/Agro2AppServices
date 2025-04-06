package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zTipoPesoUnidadesconsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zTipoPesoUnidadesconsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zTipoPesoUnidadesconsServiceImplementacion implements zTipoPesoUnidadesconsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zTipoPesoUnidadesconsEntity> consTipoPesoUnidades(Integer Bandera, String Parametro) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_TipoPesoUnidades_cons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Parametro", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Parametro", Parametro);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_TipoPesoUnidades_cons)"
                    + " - Parametros: " + Bandera + "/" + Parametro
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
