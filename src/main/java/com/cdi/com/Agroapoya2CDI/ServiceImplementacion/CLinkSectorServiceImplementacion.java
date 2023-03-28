package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CLinkSectorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CLinkSectorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CLinkSectorServiceImplementacion implements CLinkSectorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CLinkSectorEntity> ConsCLinkSector(Integer bandera, Integer CD_CNSCTVO, Integer IDSECTOR) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paCLinkSectorConsulta");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IDSECTOR", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            tpoDoc.setParameter("IDSECTOR", IDSECTOR);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
