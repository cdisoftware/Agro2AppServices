package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adminEnvioSMSEntity;
import com.cdi.com.Agroapoya2CDI.Services.adminEnvioSMService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adminEnvioSMServiceImplementacion implements adminEnvioSMService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adminEnvioSMSEntity> ConsultaEnvioSMS(Integer Bandera, Integer idSector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("pa_admin_envioSMS");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("idSector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("idSector", idSector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (pa_admin_envioSMS)"
                    + " - Parametros: " + Bandera + "/" + idSector
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
