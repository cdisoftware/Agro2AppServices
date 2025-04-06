package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zOfertaActivaProductosDetallesconsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zOfertaActivaProductosDetallesconsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zOfertaActivaProductosDetallesconsServiceImplementacion implements zOfertaActivaProductosDetallesconsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zOfertaActivaProductosDetallesconsEntity> consOfertaActivaProductosDetalles(Integer Bandera, Integer IdProducto, Integer IdOferta) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_OfertaActivaProductosDetalles_cons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdProducto", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdProducto", IdProducto);
            tpoDoc.setParameter("IdOferta", IdOferta);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_OfertaActivaProductosDetalles_cons)"
                    + " - Parametros: " + Bandera + "/" + IdProducto + "/" + IdOferta
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
