package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CtipoCuponCodigoAplicableGnlEntity;
import com.cdi.com.Agroapoya2CDI.Services.CtipoCuponCodigoAplicableGnlService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CtipoCuponCodigoAplicableGnlServiceImplementacion implements CtipoCuponCodigoAplicableGnlService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CtipoCuponCodigoAplicableGnlEntity> ConsultatipoCuponCodigoAplicable(Integer Bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_tipoCuponCodigoAplicableGeneral");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("Bandera", Bandera);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_tipoCuponCodigoAplicableGeneral)"
                    + " - Parametros: " + Bandera
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
