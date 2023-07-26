package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CRepEstEntregaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CRepEstEntregaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CRepEstEntregaServiceImplementacion implements CRepEstEntregaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CRepEstEntregaEntity> ConsRepEntrega(Integer bandera, Integer CD_CNSCTVO, Integer ID_SECTOR, Integer CD_CNDCTOR) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_Rep_Estadistico_Entrega");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("ID_SECTOR", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CD_CNDCTOR", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            tpoDoc.setParameter("ID_SECTOR", ID_SECTOR);
            tpoDoc.setParameter("CD_CNDCTOR", CD_CNDCTOR);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
