package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adreporteCantidadTotalxLibrasEntity;
import com.cdi.com.Agroapoya2CDI.Services.adreporteCantidadTotalxLibraService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adreporteCantidadTotalxLibrasImplementacion implements adreporteCantidadTotalxLibraService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adreporteCantidadTotalxLibrasEntity> ConsultaResporteTotalLibras(Integer Bandera, Integer cd_cnsctivo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_reporteCantidadTotalxLibras");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnsctivo", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("cd_cnsctivo", cd_cnsctivo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (admin_reporteCantidadTotalxLibras)"
                    + " - Parametros: " + Bandera + "/" + cd_cnsctivo
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
