package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CRelacionProdToppingEntity;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionProdToppingService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CRelacionProdToppingServiceImplementacion implements CRelacionProdToppingService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CRelacionProdToppingEntity> ConsultaRelacionProdTopping(Integer Bandera, Integer IdTopping, Integer IdSector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("pac_RelacionProdTopping");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdTopping", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdTopping", IdTopping);
            tpoDoc.setParameter("IdSector", IdSector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
