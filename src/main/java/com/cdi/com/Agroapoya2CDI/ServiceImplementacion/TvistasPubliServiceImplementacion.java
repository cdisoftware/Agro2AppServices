package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.TvistasPubliEntity;
import com.cdi.com.Agroapoya2CDI.Services.TvistasPubliService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class TvistasPubliServiceImplementacion implements TvistasPubliService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<TvistasPubliEntity> ConsultaTVistasPubli(Integer Bandera) {
        try {
            StoredProcedureQuery views = repositorio.createNamedStoredProcedureQuery("paT_vistasPubli");
            views.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            views.setParameter("Bandera", Bandera);
            return views.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paT_vistasPubli)"
                    + " - Parametros: " + Bandera
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
