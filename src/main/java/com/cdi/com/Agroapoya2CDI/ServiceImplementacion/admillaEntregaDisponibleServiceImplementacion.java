package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.admillaEntregaDisponibleEntity;
import com.cdi.com.Agroapoya2CDI.Services.admillaEntregaDisponibleService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class admillaEntregaDisponibleServiceImplementacion implements admillaEntregaDisponibleService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<admillaEntregaDisponibleEntity> ConsultaadmillaEntregaDisponible(admillaEntregaDisponibleEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_millaEntregaDisponible");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("OfertaSector", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("OfertaSector", entidad.getOfertaSector());

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia: " + ex));
            return list;
        }
    }

}
