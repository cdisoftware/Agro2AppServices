package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CInfoOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CInfoOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CInfoOfertaServiceImplementacion implements CInfoOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CInfoOfertaEntity> ConsultaInfoOferta(Integer bandera, Integer CD_CNSCTVO, Integer Id_sector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("pac_InfoOferta");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Id_sector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            tpoDoc.setParameter("Id_sector", Id_sector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (pac_InfoOferta)"
                    + " - Parametros: " + bandera + "/" + CD_CNSCTVO + "/" + Id_sector
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
