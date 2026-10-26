package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.sp_ListarVecinosEmbajadorEntity;
import com.cdi.com.Agroapoya2CDI.Services.sp_ListarVecinosEmbajadorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class sp_ListarVecinosEmbajadorServiceImplementacion implements sp_ListarVecinosEmbajadorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<sp_ListarVecinosEmbajadorEntity> ListarVecinosEmbajador(Integer IdEmbajador) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("sp_ListarVecinosEmbajador");
            tpoDoc.registerStoredProcedureParameter("IdEmbajador", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("IdEmbajador", IdEmbajador);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            String mensaje = ex.getMessage();
            Throwable root = ex;
            while (root.getCause() != null && root.getCause() != root) {
                root = root.getCause();
                if (root.getMessage() != null && !root.getMessage().isEmpty()) {
                    mensaje = root.getMessage();
                }
            }
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (sp_ListarVecinosEmbajador)"
                    + " - Parametros: " + IdEmbajador
                    + " - ERROR JAVA = " + mensaje));
            return list;
        }
    }

}
