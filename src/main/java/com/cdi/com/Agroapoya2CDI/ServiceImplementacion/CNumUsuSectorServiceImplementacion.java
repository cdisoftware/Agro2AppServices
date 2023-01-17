package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.CNumUsuSectorService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CNumUsuSectorServiceImplementacion implements CNumUsuSectorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaNumUsuSector(Integer Bandera, Integer IdSector) {
        try {
            StoredProcedureQuery NumUsu = repositorio.createNamedStoredProcedureQuery("paC_NumUsuSector");
            NumUsu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            NumUsu.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            
            NumUsu.setParameter("Bandera", Bandera);
            NumUsu.setParameter("IdSector", IdSector);
        
            NumUsu.execute();
            return JSONObject.quote((String) NumUsu.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
