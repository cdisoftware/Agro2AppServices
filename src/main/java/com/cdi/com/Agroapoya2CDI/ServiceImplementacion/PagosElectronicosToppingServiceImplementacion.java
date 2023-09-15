package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.PagosElectronicosToppingsEntity;
import com.cdi.com.Agroapoya2CDI.Services.PagosElectronicosToppingService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class PagosElectronicosToppingServiceImplementacion implements PagosElectronicosToppingService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<PagosElectronicosToppingsEntity> ConsultaPagosElectronicosTopping(Integer Bandera, String Id_carro) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("pac_PagosElectronicosToppings");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Id_carro", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Id_carro", Id_carro);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
