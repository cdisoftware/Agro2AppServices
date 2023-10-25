package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.AdmUsuariosQueryEntity;
import com.cdi.com.Agroapoya2CDI.Services.AdmUsuariosQueryService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class AdmUsuariosQueryServiceImplementacion implements AdmUsuariosQueryService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<AdmUsuariosQueryEntity> ConsultAdminUsuariosQuery(AdmUsuariosQueryEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("Admin_UsuariosQuery");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("QueryPre", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("ID_MANYCHAT", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("QueryPre", entidad.getQueryPre());
            tpoDoc.setParameter("ID_MANYCHAT", entidad.getID_MANYCHAT());

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
