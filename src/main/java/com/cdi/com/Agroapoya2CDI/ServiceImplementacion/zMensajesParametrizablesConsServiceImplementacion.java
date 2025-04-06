package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zMensajesParametrizablesConsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zMensajesParametrizablesConsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zMensajesParametrizablesConsServiceImplementacion implements zMensajesParametrizablesConsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zMensajesParametrizablesConsEntity> consMensajesParametrizables(Integer Bandera, Integer usucodig, String CorreoPersona) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_MensajesParametrizablesCons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CorreoPersona", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("usucodig", usucodig);
            tpoDoc.setParameter("CorreoPersona", CorreoPersona);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_MensajesParametrizablesCons)"
                    + " - Parametros: " + Bandera + "/" + usucodig + "/" + CorreoPersona
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
