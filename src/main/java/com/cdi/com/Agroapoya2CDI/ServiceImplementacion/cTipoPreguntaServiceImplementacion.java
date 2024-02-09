package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.cTipoPreguntaEntity;
import com.cdi.com.Agroapoya2CDI.Services.cTipoPreguntaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class cTipoPreguntaServiceImplementacion implements cTipoPreguntaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<cTipoPreguntaEntity> ConsultaTipoPregunt(Integer Bandera) {
        try {
            StoredProcedureQuery tipregunt = repositorio.createNamedStoredProcedureQuery("pac_TipoPregunta");
            tipregunt.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tipregunt.setParameter("Bandera", Bandera);
            return tipregunt.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (pac_TipoPregunta)"
                    + " - Parametros: " + Bandera
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
