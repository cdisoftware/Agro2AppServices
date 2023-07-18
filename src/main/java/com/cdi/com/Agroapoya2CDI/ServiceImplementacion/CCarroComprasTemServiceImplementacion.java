package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCarroComprasTemEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCarroComprasTemService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCarroComprasTemServiceImplementacion implements CCarroComprasTemService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CCarroComprasTemEntity> consultaCarroComprasTem(CCarroComprasTemEntity entidad, Integer Bandera, Integer Usucodig) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_CarroComprasTemporal");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Info_oferta", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Info_Toppings", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Usucodig", Usucodig);
            tpoDoc.setParameter("Info_oferta", entidad.getInfo_oferta());
            tpoDoc.setParameter("Info_Toppings", entidad.getInfo_Toppings());

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
