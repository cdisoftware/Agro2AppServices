package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.advalidaSectorMillaEntity;
import com.cdi.com.Agroapoya2CDI.Services.advalidaSectorMillaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class advalidaSectorMillaServiceImplementacion implements advalidaSectorMillaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ValidaSectorAdmin(advalidaSectorMillaEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("admin_validaSectorMilla");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("OfertaSector", String.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("IdSector", entidad.getIdSector());
            modRespuesta.setParameter("OfertaSector", entidad.getOfertaSector());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_validaSectorMilla)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdSector() + "/" + entidad.getOfertaSector()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
