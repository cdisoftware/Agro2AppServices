package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroEstComPagoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAgroEstComPagoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAgroEstComPagoServiceImplementacion implements CAgroEstComPagoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CAgroEstComPagoEntity> ConsultaCAgroEstComPago(Integer bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paCAgro_estados_compra_pago");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("bandera", bandera);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paCAgro_estados_compra_pago)"
                    + " - Parametros: " + bandera
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
