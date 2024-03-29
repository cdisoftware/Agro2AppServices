package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CValoracionOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CValoracionOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CValoracionOfertaServiceImplementacion implements CValoracionOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CValoracionOfertaEntity> ConsultaCValoracionOferta(Integer BANDERA, Integer CD_CNSCTVO, Integer ID_SCTOR_OFRTA) {
        try {
            StoredProcedureQuery valor = repositorio.createNamedStoredProcedureQuery("paCValoracionOferta");
            valor.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            valor.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            valor.registerStoredProcedureParameter("ID_SCTOR_OFRTA", Integer.class, ParameterMode.IN);

            valor.setParameter("BANDERA", BANDERA);
            valor.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            valor.setParameter("ID_SCTOR_OFRTA", ID_SCTOR_OFRTA);

            return valor.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
             list.add(0, JSONObject.quote("ERROR LOG (paCValoracionOferta)"
                    + " - Parametros: " + BANDERA + "/" + CD_CNSCTVO + "/" + ID_SCTOR_OFRTA
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
