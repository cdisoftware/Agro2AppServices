package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoClienteEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTipoClienteService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTipoClienteServiceImplementacion implements CTipoClienteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CTipoClienteEntity> ConsultaCTipoCliente(Integer Bandera, Integer Usucodig) {
        try {
            StoredProcedureQuery tipClient = repositorio.createNamedStoredProcedureQuery("paC_TipoCliente");
            tipClient.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tipClient.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);

            tipClient.setParameter("Bandera", Bandera);
            tipClient.setParameter("Usucodig", Usucodig);

            return tipClient.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_TipoCliente)"
                    + " - Parametros: " + Bandera + "/" + Usucodig
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
