package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CEjecutaSenteciaSQLEntity;
import com.cdi.com.Agroapoya2CDI.Services.CEjecutaSenteciaSQLService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CEjecutaSenteciaSQLServiceImplementacion implements CEjecutaSenteciaSQLService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CEjecutaSenteciaSQLEntity> ConsultaSentenciaSQL(CEjecutaSenteciaSQLEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_EjecutaSenteciaSQL");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("SentenciaSQL", String.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("SentenciaSQL", entidad.getMSJ_AGROAMIGO().replace("''", "'"));

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_EjecutaSenteciaSQL)"
                    + " - Parametros: " + bandera + "/" + entidad.getMSJ_AGROAMIGO().replace("''", "'")
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
