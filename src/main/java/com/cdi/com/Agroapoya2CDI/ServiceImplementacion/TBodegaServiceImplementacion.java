package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.TBodegasEntity;
import com.cdi.com.Agroapoya2CDI.Services.TBodegaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class TBodegaServiceImplementacion implements TBodegaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<TBodegasEntity> ConsultaTBodega(Integer Bandera, Integer IdDepa, Integer IdCiudad, Integer IdSector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paT_Bodegas");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdDepa", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdCiudad", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdDepa", IdDepa);
            tpoDoc.setParameter("IdCiudad", IdCiudad);
            tpoDoc.setParameter("IdSector", IdSector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paT_Bodegas)"
                    + " - Parametros: " + Bandera + "/" + IdDepa + "/" + IdCiudad + "/" + IdSector
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
