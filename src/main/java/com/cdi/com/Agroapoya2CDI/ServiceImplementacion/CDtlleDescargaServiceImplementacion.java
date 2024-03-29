package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CDtlleDescargasEntity;
import com.cdi.com.Agroapoya2CDI.Services.CDtlleDescargaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CDtlleDescargaServiceImplementacion implements CDtlleDescargaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CDtlleDescargasEntity> ConsultaCDtlleDescarga(Integer bandera, Integer IdSecto, Integer Cd_cnsctivo, Integer IdBodega) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_DtlleDescargas");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSecto", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_cnsctivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdBodega", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("IdSecto", IdSecto);
            tpoDoc.setParameter("Cd_cnsctivo", Cd_cnsctivo);
            tpoDoc.setParameter("IdBodega", IdBodega);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_DtlleDescargas)"
                    + " - Parametros: " + bandera + "/" + IdSecto + "/" + Cd_cnsctivo + "/" + IdBodega
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
