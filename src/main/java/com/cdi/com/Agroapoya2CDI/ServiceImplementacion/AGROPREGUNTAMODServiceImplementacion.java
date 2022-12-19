package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.AGROPREGUNTAMODEntity;
import com.cdi.com.Agroapoya2CDI.Services.AGROPREGUNTAMODService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class AGROPREGUNTAMODServiceImplementacion implements AGROPREGUNTAMODService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ActAGROPREGUNTA(AGROPREGUNTAMODEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery actPregunt = repositorio.createNamedStoredProcedureQuery("AGRO_PREGUNTAMOD");
            actPregunt.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actPregunt.registerStoredProcedureParameter("Texto", String.class, ParameterMode.IN);
            actPregunt.setParameter("Bandera", Bandera);
            actPregunt.setParameter("Texto", entidad.getTexto());
            actPregunt.execute();
            return JSONObject.quote((String) actPregunt.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
