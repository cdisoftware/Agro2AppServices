package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.cliepersonasPendieModEntity;
import com.cdi.com.Agroapoya2CDI.Services.cliepersonasPendieModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class cliepersonasPendieModServiceImplementacion implements cliepersonasPendieModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModClientPersonPendiente(cliepersonasPendieModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("cliente_personasPendieMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("CorreoPersona", String.class, ParameterMode.IN);
            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("CorreoPersona", entidad.getCorreoPersona());
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (cliente_personasPendieMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getCorreoPersona()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
