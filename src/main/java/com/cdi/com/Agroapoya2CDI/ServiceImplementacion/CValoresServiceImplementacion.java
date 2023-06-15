package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CValoresEntity;
import com.cdi.com.Agroapoya2CDI.Services.CValoresService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CValoresServiceImplementacion implements CValoresService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CValoresEntity> ConsultaCValores(Integer Bandera, Integer Cd_cnsctvo, Integer IdSector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_Valores");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_cnsctvo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Cd_cnsctvo", Cd_cnsctvo);
            tpoDoc.setParameter("IdSector", IdSector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
