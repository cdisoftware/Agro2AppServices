package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CRepEstEntregaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CRepEstEntregaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CRepEstEntregaServiceImplementacion implements CRepEstEntregaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CRepEstEntregaEntity> ConsRepEntrega(Integer bandera, Integer IdGrupoMilla) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_Rep_Estadistico_Entrega");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdGrupoMilla", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("IdGrupoMilla", IdGrupoMilla);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
             list.add(0, JSONObject.quote("ERROR LOG (paC_Rep_Estadistico_Entrega)"
                    + " - Parametros: " + bandera + "/" + IdGrupoMilla
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
