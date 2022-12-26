package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.CSectorPoligonoModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CSectorPoligonoModServiceImplementacion implements CSectorPoligonoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCSectorPoligono(Integer BANDERA, Integer ID_SCTOR) {
        try {
            StoredProcedureQuery poligono = repositorio.createNamedStoredProcedureQuery("paCSectorPoligonoMod");
            poligono.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            poligono.registerStoredProcedureParameter("ID_SCTOR", Integer.class, ParameterMode.IN);
            poligono.setParameter("BANDERA", BANDERA);
            poligono.setParameter("ID_SCTOR", ID_SCTOR);
            poligono.execute();
            return JSONObject.quote((String) poligono.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
