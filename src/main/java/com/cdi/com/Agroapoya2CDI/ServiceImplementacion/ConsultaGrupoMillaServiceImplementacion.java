package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ConsultaGrupoMillaEntity;
import com.cdi.com.Agroapoya2CDI.Services.ConsultaGrupoMillaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaGrupoMillaServiceImplementacion implements ConsultaGrupoMillaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaGrupoMillaEntity> ConsGrupoMILLA(Integer bandera, Integer IdSector, Integer Cd_cnsctvo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_ConsultaGrupoMilla");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_cnsctvo", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("IdSector", IdSector);
            tpoDoc.setParameter("Cd_cnsctvo", Cd_cnsctvo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
           list.add(0, JSONObject.quote("ERROR LOG (paC_ConsultaGrupoMilla)"
                    + " - Parametros: " + bandera + "/" + IdSector + "/" + Cd_cnsctvo
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
