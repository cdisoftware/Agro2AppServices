
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.SP_Agro_ConsultarBarriosPorSectorEntity;
import com.cdi.com.Agroapoya2CDI.Services.SP_Agro_ConsultarBarriosPorSectorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class SP_Agro_ConsultarBarriosPorSectorServiceImplementacion implements SP_Agro_ConsultarBarriosPorSectorService {

    @PersistenceContext
    private EntityManager repositorio;
    
    @Override
    public List<SP_Agro_ConsultarBarriosPorSectorEntity> ConsultaBarrioPorSector(Integer IdSector) {
        try {
            StoredProcedureQuery newOfert = repositorio.createNamedStoredProcedureQuery("SP_Agro_ConsultarBarriosPorSector");
            newOfert.registerStoredProcedureParameter("idSector", Integer.class, ParameterMode.IN);
            

            newOfert.setParameter("idSector", IdSector);
            
            return newOfert.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_NuevasOfertas)"
                    + " - Parametros: " + IdSector 
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
    
}
