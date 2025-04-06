package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zTipoProductoconsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zTipoProductoconsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zTipoProductoconsServiceImplementacion implements zTipoProductoconsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zTipoProductoconsEntity> consTipoProdcuto(Integer Bandera, Integer IdProducto) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_TipoProducto_cons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdProducto", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdProducto", IdProducto);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_TipoProducto_cons)"
                    + " - Parametros: " + Bandera + "/" + IdProducto
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
