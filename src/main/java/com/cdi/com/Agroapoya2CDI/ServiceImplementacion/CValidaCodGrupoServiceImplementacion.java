package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CValidaCodGrupoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CValidaCodGrupoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CValidaCodGrupoServiceImplementacion implements CValidaCodGrupoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CValidaCodGrupoEntity> ConsultaCValidaCodGrupo(Integer Bandera, String CodigoMostrar) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_ValidaCodGrupo");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CodigoMostrar", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("CodigoMostrar", CodigoMostrar);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_ValidaCodGrupo)"
                    + " - Parametros: " + Bandera + "/" + CodigoMostrar
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
