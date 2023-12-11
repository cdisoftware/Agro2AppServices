package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CondrsTransNMillaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CondrsTransNMillaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CondrsTransNMillaServiceImplementacion implements CondrsTransNMillaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CondrsTransNMillaEntity> consultaCondrsTransNMilla(Integer Bandera, Integer usucodigTrans, Integer IdGrupo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_conductoresTransportesNuevosMilla");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("usucodigTrans", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("usucodigTrans", usucodigTrans);
            tpoDoc.setParameter("IdGrupo", IdGrupo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_conductoresTransportesNuevosMilla)"
                    + " - Parametros: " + Bandera + "/" + usucodigTrans + "/" + IdGrupo
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
