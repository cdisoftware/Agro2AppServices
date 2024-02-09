package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CListaSectoresVigentesEntity;
import com.cdi.com.Agroapoya2CDI.Services.CListaSectoresVigenteService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CListaSectoresVigenteServiceImplementacion implements CListaSectoresVigenteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CListaSectoresVigentesEntity> ConsultaCListSectoresVigentes(CListaSectoresVigentesEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_ListaSectoresVigentes");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("NombreSector", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("NombreSector", entidad.getDSCRPCION_SCTOR());

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_ListaSectoresVigentes)"
                    + " - Parametros: " + Bandera + "/" + entidad.getDSCRPCION_SCTOR()
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
