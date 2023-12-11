package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CSubSeguimientoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CSubSeguimientoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CSubSeguimientoServiceImplementacion implements CSubSeguimientoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CSubSeguimientoEntity> ConsultaCSubSeguimiento(Integer Bandera, Integer IdCliente, Integer IdSeguimiento) {
        try {
            StoredProcedureQuery subseg = repositorio.createNamedStoredProcedureQuery("paC_SubSeguimiento");
            subseg.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            subseg.registerStoredProcedureParameter("IdCliente", Integer.class, ParameterMode.IN);
            subseg.registerStoredProcedureParameter("IdSeguimiento", Integer.class, ParameterMode.IN);
            subseg.setParameter("Bandera", Bandera);
            subseg.setParameter("IdCliente", IdCliente);
            subseg.setParameter("IdSeguimiento", IdSeguimiento);
            return subseg.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_SubSeguimiento)"
                    + " - Parametros: " + Bandera + "/" + IdCliente + "/" + IdSeguimiento
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
