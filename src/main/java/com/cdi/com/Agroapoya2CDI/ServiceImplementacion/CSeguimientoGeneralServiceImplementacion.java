package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CSeguimientoGeneralEntity;
import com.cdi.com.Agroapoya2CDI.Services.CSeguimientoGeneralService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CSeguimientoGeneralServiceImplementacion implements CSeguimientoGeneralService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CSeguimientoGeneralEntity> ConsultaCSeguimientoGen(Integer Bandera, Integer IdCliente) {
        try {
            StoredProcedureQuery rastreo = repositorio.createNamedStoredProcedureQuery("paC_SeguimientoGeneral");
            rastreo.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rastreo.registerStoredProcedureParameter("IdCliente", Integer.class, ParameterMode.IN);
            rastreo.setParameter("Bandera", Bandera);
            rastreo.setParameter("IdCliente", IdCliente);
            return rastreo.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_SeguimientoGeneral)"
                    + " - Parametros: " + Bandera + "/" + IdCliente
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
