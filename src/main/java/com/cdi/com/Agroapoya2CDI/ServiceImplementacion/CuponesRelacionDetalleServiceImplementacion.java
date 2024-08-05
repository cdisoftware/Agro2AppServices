package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CuponesRelacionDetallEntity;
import com.cdi.com.Agroapoya2CDI.Services.CuponesRelacionDetalleService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CuponesRelacionDetalleServiceImplementacion implements CuponesRelacionDetalleService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CuponesRelacionDetallEntity> ConsultaCuponesRela(Integer Bandera, Integer IdCarroLider) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_CuponesRelacionDetalle");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdCarroLider", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdCarroLider", IdCarroLider);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_CuponesRelacionDetalle)"
                    + " - Parametros: " + Bandera + "/" + IdCarroLider
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
