package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zrelacionEmbajadorVecinoModEntity;
import com.cdi.com.Agroapoya2CDI.Services.zrelacionEmbajadorVecinoModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zrelacionEmbajadorVecinoModServiceImplementacion implements zrelacionEmbajadorVecinoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modZRelacionEmbajadorVecino(Integer Bandera, zrelacionEmbajadorVecinoModEntity Entidad) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_relacionEmbajadorVecinoMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("UsucodigEmbajador", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("UsucodigVecino", Integer.class, ParameterMode.IN);
            
            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("UsucodigEmbajador", Entidad.getUsucodigEmbajador());
            parametros.setParameter("UsucodigVecino", Entidad.getUsucodigVecino());
            
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_relacionEmbajadorVecinoMod)"
                    + " - Parametros: " + Bandera + "/" + Entidad.getUsucodigEmbajador() + "/" + Entidad.getUsucodigVecino()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
