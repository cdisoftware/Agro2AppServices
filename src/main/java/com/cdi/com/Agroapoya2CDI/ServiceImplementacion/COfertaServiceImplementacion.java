package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.COfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.COfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class COfertaServiceImplementacion implements COfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<COfertaEntity> ConsultaCOferta(Integer bandera, String CD_CNSCTVO) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paCOferta");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CD_CNSCTVO", String.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("CD_CNSCTVO", CD_CNSCTVO);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paCOferta)"
                    + " - Parametros: " + bandera + "/" + CD_CNSCTVO
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
