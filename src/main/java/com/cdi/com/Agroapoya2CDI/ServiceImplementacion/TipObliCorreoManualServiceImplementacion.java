package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.TipObliCorreoManualEntity;
import com.cdi.com.Agroapoya2CDI.Services.TipObliCorreoManualService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class TipObliCorreoManualServiceImplementacion implements TipObliCorreoManualService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<TipObliCorreoManualEntity> ConsultaObliCorreoMan(Integer Bandera, Integer IdPlantilla) {
        try {
            StoredProcedureQuery manual = repositorio.createNamedStoredProcedureQuery("Agro_TipObliCorreoManual");
            manual.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            manual.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);

            manual.setParameter("Bandera", Bandera);
            manual.setParameter("IdPlantilla", IdPlantilla);

            return manual.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
