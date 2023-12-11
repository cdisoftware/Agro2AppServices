package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CToppingCarroModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CToppingCarroModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CToppingCarroModServiceImplementacion implements CToppingCarroModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCToppingCarro(CToppingCarroModEntity entidad) {
        try {
            StoredProcedureQuery topping = repositorio.createNamedStoredProcedureQuery("paC_ToppingCarroMod");
            topping.registerStoredProcedureParameter("Id_cliente", Integer.class, ParameterMode.IN);
            topping.registerStoredProcedureParameter("IdTopping", Integer.class, ParameterMode.IN);
            topping.registerStoredProcedureParameter("Unidades", Integer.class, ParameterMode.IN);

            topping.setParameter("Id_cliente", entidad.getId_cliente());
            topping.setParameter("IdTopping", entidad.getIdTopping());
            topping.setParameter("Unidades", entidad.getUnidades());

            topping.execute();
            return JSONObject.quote((String) topping.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_ToppingCarroMod)"
                    + " - Parametros: " + entidad.getId_cliente() + "/" + entidad.getIdTopping() + "/" + entidad.getUnidades()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
