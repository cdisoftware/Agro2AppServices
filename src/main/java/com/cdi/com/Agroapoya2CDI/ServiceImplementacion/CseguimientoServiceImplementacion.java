package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CseguimientoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CseguimientoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CseguimientoServiceImplementacion implements CseguimientoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CseguimientoEntity> ConsultaCSeguimiento(Integer Bandera, Integer IdCliente) {
        try {
            StoredProcedureQuery seguimiento = repositorio.createNamedStoredProcedureQuery("paC_seguimiento");
            seguimiento.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            seguimiento.registerStoredProcedureParameter("IdCliente", Integer.class, ParameterMode.IN);
            seguimiento.setParameter("Bandera", Bandera);
            seguimiento.setParameter("IdCliente", IdCliente);
            return seguimiento.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_seguimiento)"
                    + " - Parametros: " + Bandera + "/" + IdCliente
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
