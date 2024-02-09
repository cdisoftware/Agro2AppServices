package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CPinUltimaMillaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CPinUltimaMillaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPinUltimaMillaServiceImplementacion implements CPinUltimaMillaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CPinUltimaMillaEntity> consultaCPinUltiMilla(Integer Bandera, Integer cd_cnctvo, Integer idSector, Integer IdGrupo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_PinUltimaMilla");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnctvo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("idSector", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("cd_cnctvo", cd_cnctvo);
            tpoDoc.setParameter("idSector", idSector);
            tpoDoc.setParameter("IdGrupo", IdGrupo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_PinUltimaMilla)"
                    + " - Parametros: " + Bandera + "/" + cd_cnctvo + "/" + idSector + "/" + IdGrupo
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
