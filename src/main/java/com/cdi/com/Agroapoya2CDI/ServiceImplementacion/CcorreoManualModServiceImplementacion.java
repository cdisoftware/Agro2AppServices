package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CcorreoManualModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CcorreoManualModService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CcorreoManualModServiceImplementacion implements CcorreoManualModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCCorreoManual(CcorreoManualModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("paC_correoManualMod");
            respu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("IdEnvio", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("Query", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("Cd_cnctivo", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("IdEstado", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("IdProgramado", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("FechaEnvio", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("HorarioEnvio", Integer.class, ParameterMode.IN);

            respu.setParameter("Bandera", Bandera);
            respu.setParameter("IdEnvio", entidad.getIdEnvio());
            respu.setParameter("Query", entidad.getQuery());
            respu.setParameter("IdSector", entidad.getIdSector());
            respu.setParameter("Cd_cnctivo", entidad.getCd_cnctivo());
            respu.setParameter("IdPlantilla", entidad.getIdPlantilla());
            respu.setParameter("IdEstado", entidad.getIdEstado());
            respu.setParameter("IdProgramado", entidad.getIdProgramado());
            respu.setParameter("FechaEnvio", entidad.getFechaEnvio());
            respu.setParameter("HorarioEnvio", entidad.getHorarioEnvio());

            respu.execute();
            return JSONObject.quote((String) respu.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
