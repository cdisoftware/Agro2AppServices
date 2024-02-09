package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.admillaPinModEntity;
import com.cdi.com.Agroapoya2CDI.Services.admillaPinModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class admillaPinModServiceImplementacion implements admillaPinModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAdmillaPin(admillaPinModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("admin_millaPinMod");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdCarro", Integer.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("IdGrupo", entidad.getIdGrupo());
            modRespuesta.setParameter("IdCarro", entidad.getIdCarro());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_millaPinMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdGrupo() + "/" + entidad.getIdCarro()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
