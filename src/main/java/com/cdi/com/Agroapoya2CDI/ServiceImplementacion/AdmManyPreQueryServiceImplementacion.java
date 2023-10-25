package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.AdmManyPreQueryEntity;
import com.cdi.com.Agroapoya2CDI.Services.AdmManyPreQueryService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class AdmManyPreQueryServiceImplementacion implements AdmManyPreQueryService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String QueryAdmManyChatPre(AdmManyPreQueryEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("Admin_ManyPreQuery");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("id_sector", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Cd_cnsctivo", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("QueryAdicional", String.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("id_sector", entidad.getId_sector());
            modRespuesta.setParameter("Cd_cnsctivo", entidad.getCd_cnsctivo());
            modRespuesta.setParameter("QueryAdicional", entidad.getQueryAdicional());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
