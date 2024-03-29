package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.entregasConductorEntity;
import com.cdi.com.Agroapoya2CDI.Services.entregasConductorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class entregasConductorServiceImplementacion implements entregasConductorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<entregasConductorEntity> ConsultaEntregasConductor(Integer bandera, Integer ID_CNDCTOR, Integer id_Sector, Integer cd_cnctivo, String coordernadas) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_entragasConductor");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("ID_CNDCTOR", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("id_Sector", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnctivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("coordernadas", String.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("ID_CNDCTOR", ID_CNDCTOR);
            tpoDoc.setParameter("id_Sector", id_Sector);
            tpoDoc.setParameter("cd_cnctivo", cd_cnctivo);
            tpoDoc.setParameter("coordernadas", coordernadas);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_entragasConductor)"
                    + " - Parametros: " + bandera + "/" + ID_CNDCTOR + "/" + id_Sector + "/" + cd_cnctivo + "/" + coordernadas
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
