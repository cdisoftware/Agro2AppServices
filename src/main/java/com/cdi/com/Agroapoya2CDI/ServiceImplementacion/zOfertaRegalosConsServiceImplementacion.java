package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zOfertaRegalosConsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zOfertaRegalosConsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zOfertaRegalosConsServiceImplementacion implements zOfertaRegalosConsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zOfertaRegalosConsEntity> consOfertaRegalos(Integer Bandera, Integer IdOferta) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_OfertaRegalos_Cons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdOferta", IdOferta);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_OfertaRegalos_Cons)"
                    + " - Parametros: " + Bandera + "/" + IdOferta
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
