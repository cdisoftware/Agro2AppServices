package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoPagosTransEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTipoPagosTransService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;

import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTipoPagosTransServiceImplementacion implements CTipoPagosTransService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CTipoPagosTransEntity> ConsultaCTipoPagosTrans(Integer Bandera, Integer Usucodig) {
        try {
            StoredProcedureQuery conspagos = repositorio.createNamedStoredProcedureQuery("paC_TipoPagosTrans");
            conspagos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            conspagos.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);

            conspagos.setParameter("Bandera", Bandera);
            conspagos.setParameter("Usucodig", Usucodig);

            return conspagos.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_TipoPagosTrans)"
                    + " - Parametros: " + Bandera + "/" + Usucodig 
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
