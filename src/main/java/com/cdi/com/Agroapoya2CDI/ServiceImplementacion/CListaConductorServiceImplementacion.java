package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CListaConductorEntity;
import com.cdi.com.Agroapoya2CDI.Services.CListaConductorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CListaConductorServiceImplementacion implements CListaConductorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CListaConductorEntity> ConsultaCListaConductor(Integer Bandera, Integer cd_cnsctivo, Integer idSector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_ListaConductor");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnsctivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("idSector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("cd_cnsctivo", cd_cnsctivo);
            tpoDoc.setParameter("idSector", idSector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
