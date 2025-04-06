package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zTipoImagenOfertaConsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zTipoImagenOfertaConsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zTipoImagenOfertaConsServiceImplementacion implements zTipoImagenOfertaConsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zTipoImagenOfertaConsEntity> consTipoImagenOferta(Integer Bandedera, Integer IdProducto) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_TipoImagenOferta_Cons");
            tpoDoc.registerStoredProcedureParameter("Bandedera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdProducto", Integer.class, ParameterMode.IN);
            
            tpoDoc.setParameter("Bandedera", Bandedera);
            tpoDoc.setParameter("IdProducto", IdProducto);
            
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_TipoImagenOferta_Cons)"
                    + " - Parametros: " + Bandedera + "/" + IdProducto
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
