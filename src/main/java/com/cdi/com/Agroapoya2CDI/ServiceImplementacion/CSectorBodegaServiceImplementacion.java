package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CSectorBodegaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CSectorBodegaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CSectorBodegaServiceImplementacion implements CSectorBodegaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CSectorBodegaEntity> ConsultaCSectorBodega(Integer Bandera, Integer IdBodega) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_SectorBodega");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdBodega", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdBodega", IdBodega);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_SectorBodega)"
                    + " - Parametros: " + Bandera + "/" + IdBodega
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
