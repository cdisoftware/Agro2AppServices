package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CLinkConsultaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CLinkConsultaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CLinkConsultaServiceImplementacion implements CLinkConsultaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CLinkConsultaEntity> ConsCLinkConsulta(Integer bandera, String CD_HEXA) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paCLinkConsulta");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CD_HEXA", String.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("CD_HEXA", CD_HEXA);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
             list.add(0, JSONObject.quote("ERROR LOG (paCLinkConsulta)"
                    + " - Parametros: " + bandera + "/" + CD_HEXA 
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
