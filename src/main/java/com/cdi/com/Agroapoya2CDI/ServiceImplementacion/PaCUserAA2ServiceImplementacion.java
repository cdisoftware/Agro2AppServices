package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.PaCUserAA2Entity;
import com.cdi.com.Agroapoya2CDI.Services.PaCUserAA2Service;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class PaCUserAA2ServiceImplementacion implements PaCUserAA2Service {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<PaCUserAA2Entity> consultaCUsersAA2(PaCUserAA2Entity entidad, Integer Bandera, Integer TipoUser) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("PaCUserAA2");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("TipoUser", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("UsuCodig", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("NumTelefono", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Parametro", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("TipoUser", TipoUser);
            tpoDoc.setParameter("UsuCodig", entidad.getUSUCODIG());
            tpoDoc.setParameter("Email", entidad.getCORREO_PERSONA());
            tpoDoc.setParameter("NumTelefono", entidad.getCELULAR_PERSONA());
            tpoDoc.setParameter("Parametro", entidad.getParametro());

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (PaCUserAA2)"
                    + " - Parametros: " + Bandera + "/" + TipoUser + "/" + entidad.getUSUCODIG()
                    + "/" + entidad.getCORREO_PERSONA() + "/" + entidad.getCELULAR_PERSONA() + "/" + entidad.getParametro()
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
