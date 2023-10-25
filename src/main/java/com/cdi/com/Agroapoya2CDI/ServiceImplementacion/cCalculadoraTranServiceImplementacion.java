package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.cCalculadoraTransEntity;
import com.cdi.com.Agroapoya2CDI.Services.cCalculadoraTranService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class cCalculadoraTranServiceImplementacion implements cCalculadoraTranService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<cCalculadoraTransEntity> consultaCalculadoraTrans(cCalculadoraTransEntity entidad, Integer Bandera, Integer Formato, Integer Unidades, Integer IdCarro) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("pac_CalculadoraTrans");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Formato", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Unidades", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Topping", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdCarro", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Formato", Formato);
            tpoDoc.setParameter("Unidades", Unidades);
            tpoDoc.setParameter("Topping", entidad.getTopping());
            tpoDoc.setParameter("IdCarro", IdCarro);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
