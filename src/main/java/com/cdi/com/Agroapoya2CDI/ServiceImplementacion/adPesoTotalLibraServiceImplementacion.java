package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adPesoTotalLibrasEntity;
import com.cdi.com.Agroapoya2CDI.Services.adPesoTotalLibraService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adPesoTotalLibraServiceImplementacion implements adPesoTotalLibraService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adPesoTotalLibrasEntity> ConsultaPesoTotalLibra(Integer Bandera, Integer Cd_cnctvo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_PesoTotalLibras");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_cnctvo", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Cd_cnctvo", Cd_cnctvo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paA_Ofertas)"
                    + " - Parametros: " + Bandera + "/" + Cd_cnctvo
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
