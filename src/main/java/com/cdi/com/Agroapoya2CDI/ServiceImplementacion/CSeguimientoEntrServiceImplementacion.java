package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CSeguimientoEntrEntity;
import com.cdi.com.Agroapoya2CDI.Services.CSeguimientoEntrService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CSeguimientoEntrServiceImplementacion implements CSeguimientoEntrService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CSeguimientoEntrEntity> ConsSeguimientoEntrega(CSeguimientoEntrEntity entidad, Integer bandera, Integer ID_CNDCTOR, Integer id_Sector, Integer cd_cnctivo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_SeguimientoEntregas");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("ID_CNDCTOR", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("id_Sector", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnctivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("coordernadas", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("ID_CNDCTOR", ID_CNDCTOR);
            tpoDoc.setParameter("id_Sector", id_Sector);
            tpoDoc.setParameter("cd_cnctivo", cd_cnctivo);
            tpoDoc.setParameter("coordernadas", entidad.getCOORDENADAS_ENTR());

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
