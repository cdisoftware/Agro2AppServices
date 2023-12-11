package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.TSectoresEtvEntity;
import com.cdi.com.Agroapoya2CDI.Services.TSectoresEtvService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class TSectoresEtvServiceImplementacion implements TSectoresEtvService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<TSectoresEtvEntity> ConsultaSectoresEtv(Integer bandera, String NOMBRE_SECTOR, Integer ID_ZONA, Integer CD_CNSCTIVO) {
        try {
            StoredProcedureQuery Etv = repositorio.createNamedStoredProcedureQuery("paT_SectoresEtv");
            Etv.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            Etv.registerStoredProcedureParameter("NOMBRE_SECTOR", String.class, ParameterMode.IN);
            Etv.registerStoredProcedureParameter("ID_ZONA", Integer.class, ParameterMode.IN);
            Etv.registerStoredProcedureParameter("CD_CNSCTIVO", Integer.class, ParameterMode.IN);

            Etv.setParameter("bandera", bandera);
            Etv.setParameter("NOMBRE_SECTOR", NOMBRE_SECTOR);
            Etv.setParameter("ID_ZONA", ID_ZONA);
            Etv.setParameter("CD_CNSCTIVO", CD_CNSCTIVO);

            return Etv.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paT_SectoresEtv)"
                    + " - Parametros: " + bandera + "/" + NOMBRE_SECTOR + "/" + ID_ZONA + "/" + CD_CNSCTIVO
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
