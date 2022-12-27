package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.TModDatosBasicEntity;
import com.cdi.com.Agroapoya2CDI.Services.TModDatosBasicService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class TModDatosBasicServiceImplementacion implements TModDatosBasicService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<TModDatosBasicEntity> ConsultaTModuloDatBasicos(Integer Bandera) {
        try {
            StoredProcedureQuery datos = repositorio.createNamedStoredProcedureQuery("paT_ModuloDatosBasicos");
            datos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            datos.setParameter("Bandera", Bandera);
            return datos.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
