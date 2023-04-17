package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CDtlleDescargasModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CDtlleDescargasModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CDtlleDescargasModServiceImplementacion implements CDtlleDescargasModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCDtlleDescargas(CDtlleDescargasModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery SqlService = repositorio.createNamedStoredProcedureQuery("paC_DtlleDescargasMod");
            SqlService.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("cd_cnctvo", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("CantidadMax", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("KilosMax", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("DistanciaMax", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            SqlService.setParameter("bandera", bandera);
            SqlService.setParameter("cd_cnctvo", entidad.getCd_cnctvo());
            SqlService.setParameter("CantidadMax", entidad.getCantidadMax());
            SqlService.setParameter("KilosMax", entidad.getKilosMax());
            SqlService.setParameter("DistanciaMax", entidad.getDistanciaMax());
            SqlService.setParameter("IdSector", entidad.getIdSector());

            SqlService.execute();
            return JSONObject.quote((String) SqlService.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
