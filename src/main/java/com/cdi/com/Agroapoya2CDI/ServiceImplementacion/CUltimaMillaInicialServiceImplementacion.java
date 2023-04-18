package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CUltimaMillaInicialEntity;
import com.cdi.com.Agroapoya2CDI.Services.CUltimaMillaInicialService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CUltimaMillaInicialServiceImplementacion implements CUltimaMillaInicialService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCUltimMillaIni(CUltimaMillaInicialEntity entidad, Integer Bandera) {

        try {
            StoredProcedureQuery SqlService = repositorio.createNamedStoredProcedureQuery("paC_UltimaMillaInicial");
            SqlService.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("cd_csctvo", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("idSector", Integer.class, ParameterMode.IN);

            SqlService.setParameter("Bandera", Bandera);
            SqlService.setParameter("cd_csctvo", entidad.getCd_csctvo());
            SqlService.setParameter("idSector", entidad.getIdSector());

            SqlService.execute();
            return JSONObject.quote((String) SqlService.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
