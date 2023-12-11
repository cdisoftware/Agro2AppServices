package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.clientOrdenExternalModEntity;
import com.cdi.com.Agroapoya2CDI.Services.clientOrdenExternalModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class clientOrdenExternalModServiceImplementacion implements clientOrdenExternalModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModclientOrdenExternal(clientOrdenExternalModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("cliente_OrdenExternalMod");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Id_carro", String.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("Id_carro", entidad.getId_carro());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (cliente_OrdenExternalMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getId_carro()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
