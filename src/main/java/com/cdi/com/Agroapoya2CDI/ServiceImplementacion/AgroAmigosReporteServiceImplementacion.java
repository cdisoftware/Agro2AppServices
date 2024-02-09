package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.AgroAmigosReporteEntity;
import com.cdi.com.Agroapoya2CDI.Services.AgroAmigosReporteService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class AgroAmigosReporteServiceImplementacion implements AgroAmigosReporteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<AgroAmigosReporteEntity> ConsultaAgroAmigosReport(Integer Bandera, Integer Usucodig) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_AgroAmigosReporte");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Usucodig", Usucodig);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_AgroAmigosReporte)"
                    + " - Parametros: " + Bandera + "/" + Usucodig
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
