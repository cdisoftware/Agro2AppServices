package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zcuponesDescuentoconsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zcuponesDescuentoconsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zcuponesDescuentoconsServiceImplementacion implements zcuponesDescuentoconsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zcuponesDescuentoconsEntity> consCuponesDescuento(Integer Bandera, Integer TipoCupon, Integer IdOferta, Integer IdRegalo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_cuponesDescuento_cons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("TipoCupon", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdRegalo", Integer.class, ParameterMode.IN);


            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("TipoCupon", TipoCupon);
            tpoDoc.setParameter("IdOferta", IdOferta);
            tpoDoc.setParameter("IdRegalo", IdRegalo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_cuponesDescuento_cons)"
                    + " - Parametros: " + Bandera + "/" + TipoCupon + "/" + IdOferta + "/" + IdRegalo
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
