package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.RespuestaManyChatEntity;
import com.cdi.com.Agroapoya2CDI.Services.RespuestaManyChatService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class RespuestaManyChatServiceImplementacion implements RespuestaManyChatService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String RespuestaManychat(RespuestaManyChatEntity entidad, Integer IdPregunta, Integer Usucodig) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("paC_RespuestaManyChat");
            modRespuesta.registerStoredProcedureParameter("Respuesta", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdPregunta", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);

            modRespuesta.setParameter("Respuesta", entidad.getRespuesta());
            modRespuesta.setParameter("IdPregunta", IdPregunta);
            modRespuesta.setParameter("Usucodig", Usucodig);

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("RespMicro"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_RespuestaManyChat)"
                    + " - Parametros: " + entidad.getRespuesta() + "/" + IdPregunta + "/" + Usucodig
                    + " - ERROR JAVA = " + ex);
        }
    }

}
