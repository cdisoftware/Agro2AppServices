package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroPreguntaOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAgroPreguntaOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAgroPreguntaOfertaServiceImplementacion implements CAgroPreguntaOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CAgroPreguntaOfertaEntity> ConsultaCAgroPreguntOfert(CAgroPreguntaOfertaEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery agro = repositorio.createNamedStoredProcedureQuery("paCAgro_Pregunta_Oferta");
            agro.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            agro.registerStoredProcedureParameter("CD_CNSCTVO", String.class, ParameterMode.IN);
            agro.registerStoredProcedureParameter("ID_SCTOR_OFRTA", Integer.class, ParameterMode.IN);
            agro.registerStoredProcedureParameter("ID_PRGNTA_OFR", Integer.class, ParameterMode.IN);

            agro.setParameter("bandera", bandera);
            agro.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            agro.setParameter("ID_SCTOR_OFRTA", entidad.getID_SCTOR_OFRTA());
            agro.setParameter("ID_PRGNTA_OFR", entidad.getID_PRGNTA_OFR());

            return agro.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paCAgro_Pregunta_Oferta)"
                    + " - Parametros: " + bandera + "/" + entidad.getCD_CNSCTVO() + "/" + entidad.getID_SCTOR_OFRTA() + "/" + entidad.getID_PRGNTA_OFR()
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
