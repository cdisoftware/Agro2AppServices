package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.mvConsGeneralEntregaEntity;
import com.cdi.com.Agroapoya2CDI.Services.mvConsGeneralEntregaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class mvConsGeneralEntregaServiceImplementacion implements mvConsGeneralEntregaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<mvConsGeneralEntregaEntity> CosultaGeneralEntregaMovile(Integer Bandera, Integer IdGrupo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("movile_ConsultaGeneralEntrega");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdGrupo", IdGrupo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (movile_ConsultaGeneralEntrega)"
                    + " - Parametros: " + Bandera + "/" + IdGrupo
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
