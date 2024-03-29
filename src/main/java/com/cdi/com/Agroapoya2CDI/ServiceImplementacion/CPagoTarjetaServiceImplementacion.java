package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CPagoTarjetaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CPagoTarjetaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPagoTarjetaServiceImplementacion implements CPagoTarjetaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CPagoTarjetaEntity> ConsulPagoTarjeta(Integer Bandera, Integer Usucodig, Integer IdCarro) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_PagoTarjeta");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdCarro", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Usucodig", Usucodig);
            tpoDoc.setParameter("IdCarro", IdCarro);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
              list.add(0, JSONObject.quote("ERROR LOG (paC_PagoTarjeta)"
                    + " - Parametros: " + Bandera + "/" + Usucodig + "/" + IdCarro
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
