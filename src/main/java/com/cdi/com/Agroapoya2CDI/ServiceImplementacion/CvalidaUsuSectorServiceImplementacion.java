package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.CvalidaUsuSectorService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CvalidaUsuSectorServiceImplementacion implements CvalidaUsuSectorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaCValidaUsuSector(Integer Bandera, Integer IdSector) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paC_validaUsuSector");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdSector", IdSector);
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
