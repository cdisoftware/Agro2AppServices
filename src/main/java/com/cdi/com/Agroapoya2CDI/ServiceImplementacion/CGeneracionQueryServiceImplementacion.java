package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CGeneracionQueryEntity;
import com.cdi.com.Agroapoya2CDI.Services.CGeneracionQueryService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CGeneracionQueryServiceImplementacion implements CGeneracionQueryService{
    @PersistenceContext
    private EntityManager repositorio;
    
    @Override
    public List<CGeneracionQueryEntity> ConsQuery(Integer Bandera, Integer IdPlantilla, Integer IdSector, Integer cd_cnctivo, String Respuesta) {
        try {
            StoredProcedureQuery seguimiento = repositorio.createNamedStoredProcedureQuery("pac_GeneracionQuery");
            seguimiento.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            seguimiento.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            seguimiento.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            seguimiento.registerStoredProcedureParameter("cd_cnctivo", Integer.class, ParameterMode.IN);
            seguimiento.registerStoredProcedureParameter("Respuesta", String.class, ParameterMode.IN);
            
            seguimiento.setParameter("Bandera", Bandera);
            seguimiento.setParameter("IdPlantilla", IdPlantilla);
            seguimiento.setParameter("IdSector", IdSector);
            seguimiento.setParameter("cd_cnctivo", cd_cnctivo);
            seguimiento.setParameter("Respuesta", Respuesta);
            
            return seguimiento.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
