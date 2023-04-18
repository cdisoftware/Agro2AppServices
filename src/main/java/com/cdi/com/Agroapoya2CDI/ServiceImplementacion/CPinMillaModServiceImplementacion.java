package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CPinMillaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CPinMillaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPinMillaModServiceImplementacion implements CPinMillaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCPinMilla(CPinMillaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery SqlService = repositorio.createNamedStoredProcedureQuery("paC_PinMillaMod");
            SqlService.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("IdCarro", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("cd_csctvo", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            SqlService.setParameter("Bandera", Bandera);
            SqlService.setParameter("IdGrupo", entidad.getIdGrupo());
            SqlService.setParameter("IdCarro", entidad.getIdCarro());
            SqlService.setParameter("cd_csctvo", entidad.getCd_csctvo());
            SqlService.setParameter("IdSector", entidad.getIdSector());

            SqlService.execute();
            return JSONObject.quote((String) SqlService.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
