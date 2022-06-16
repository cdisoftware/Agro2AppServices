package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.INFOGENERALEntity;
import com.cdi.com.Agroapoya2CDI.Services.INFOGENERALService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class INFOGENERALServiceImplementacion implements INFOGENERALService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<INFOGENERALEntity> ConsultaInfoGeneral(Integer ID) {
        try {
            StoredProcedureQuery consinfogen = repositorio.createNamedStoredProcedureQuery("INFOGENERAL");
            consinfogen.registerStoredProcedureParameter("ID", Integer.class, ParameterMode.IN);
            consinfogen.setParameter("ID", ID);
            return consinfogen.getResultList();
        } catch (Exception ex) {

            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
