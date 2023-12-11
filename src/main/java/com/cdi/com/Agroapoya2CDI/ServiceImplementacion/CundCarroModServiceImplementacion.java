package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CundCarroModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CundCarroModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CundCarroModServiceImplementacion implements CundCarroModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCUndCarro(CundCarroModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modCarro = repositorio.createNamedStoredProcedureQuery("paC_undCarroMod");
            modCarro.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modCarro.registerStoredProcedureParameter("Unidades", Integer.class, ParameterMode.IN);
            modCarro.registerStoredProcedureParameter("Id_carro", Integer.class, ParameterMode.IN);

            modCarro.setParameter("Bandera", Bandera);
            modCarro.setParameter("Unidades", entidad.getUnidades());
            modCarro.setParameter("Id_carro", entidad.getId_carro());

            modCarro.execute();
            return JSONObject.quote((String) modCarro.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_undCarroMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getUnidades() + "/" + entidad.getId_carro()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
