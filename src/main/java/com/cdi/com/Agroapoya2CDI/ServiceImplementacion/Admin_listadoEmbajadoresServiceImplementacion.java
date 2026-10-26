package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.Admin_listadoEmbajadoresEntity;
import com.cdi.com.Agroapoya2CDI.Services.Admin_listadoEmbajadoresService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class Admin_listadoEmbajadoresServiceImplementacion implements Admin_listadoEmbajadoresService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<Admin_listadoEmbajadoresEntity> ConsultaAdminListadoEmbajadores(Integer Bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("Admin_listadoEmbajadores");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("Bandera", Bandera);

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
            list.add(0, JSONObject.quote("ERROR LOG (Admin_listadoEmbajadores)"
                    + " - Parametros: " + Bandera
                    + " - ERROR JAVA = " + mensaje));
            return list;
        }
    }

}
