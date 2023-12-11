package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.CvalidaNumeroService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CvalidaNumeroServiceImplementacion implements CvalidaNumeroService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaCValidaNum(Integer Bandera, String numeroTel) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paC_validaNumero");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("numeroTel", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("numeroTel", numeroTel);
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_validaNumero)"
                    + " - Parametros: " + Bandera + "/" + numeroTel
                    + " - ERROR JAVA = " + ex);
        }
    }
}
