package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.admillaCoordenadasSectorEntity;
import com.cdi.com.Agroapoya2CDI.Services.admillaCoordenadasSectorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class admillaCoordenadasSectorServiceImplementacion implements admillaCoordenadasSectorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<admillaCoordenadasSectorEntity> ConsultaAdmillaCoodSector(Integer Bandera, Integer IdSector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_millaCoordenadasSector");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdSector", IdSector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia: " + ex));
            return list;
        }
    }

}
