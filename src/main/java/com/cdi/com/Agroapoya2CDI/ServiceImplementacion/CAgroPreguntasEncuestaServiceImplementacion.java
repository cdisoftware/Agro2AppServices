package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroPreguntasEncuestaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAgroPreguntasEncuestaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAgroPreguntasEncuestaServiceImplementacion implements CAgroPreguntasEncuestaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CAgroPreguntasEncuestaEntity> ConsultaCAgroPreguntEnc(Integer bandera, String CD_CNSCTVO, String ID_SCTOR_OFRTA) {
        try {
            StoredProcedureQuery preguntEnc = repositorio.createNamedStoredProcedureQuery("paCAgro_Preguntas_Encuesta");
            preguntEnc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            preguntEnc.registerStoredProcedureParameter("CD_CNSCTVO", String.class, ParameterMode.IN);
            preguntEnc.registerStoredProcedureParameter("ID_SCTOR_OFRTA", String.class, ParameterMode.IN);

            preguntEnc.setParameter("bandera", bandera);
            preguntEnc.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            preguntEnc.setParameter("ID_SCTOR_OFRTA", ID_SCTOR_OFRTA);

            return preguntEnc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
