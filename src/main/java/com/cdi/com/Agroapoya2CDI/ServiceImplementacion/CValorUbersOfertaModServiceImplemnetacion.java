package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CValorUbersOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CValorUbersOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CValorUbersOfertaModServiceImplemnetacion implements CValorUbersOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCValorUberOfert(CValorUbersOfertaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery SqlService = repositorio.createNamedStoredProcedureQuery("paC_ValorUbersOfertaMod");
            SqlService.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("ValorTrans", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("cd_cnctvo", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("idSector", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);

            SqlService.setParameter("Bandera", Bandera);
            SqlService.setParameter("ValorTrans", entidad.getValorTrans());
            SqlService.setParameter("cd_cnctvo", entidad.getCd_cnctvo());
            SqlService.setParameter("idSector", entidad.getIdSector());
            SqlService.setParameter("IdGrupo", entidad.getIdGrupo());

            SqlService.execute();
            return JSONObject.quote((String) SqlService.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
