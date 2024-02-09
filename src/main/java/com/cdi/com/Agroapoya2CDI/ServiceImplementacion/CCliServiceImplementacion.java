package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CClisEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCliService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCliServiceImplementacion implements CCliService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CClisEntity> ConsultaCliente(CClisEntity entidad) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("PaC_Clis");
            tpoDoc.registerStoredProcedureParameter("Cedula", String.class, ParameterMode.IN);
            tpoDoc.setParameter("Cedula", entidad.getCedula());
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (PaC_Clis)"
                    + " - Parametros: " + entidad.getCedula()
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
