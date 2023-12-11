package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CPerfilCampesinoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CPerfilCampesinoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPerfilCampesinoServiceImplementacion implements CPerfilCampesinoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CPerfilCampesinoEntity> ConsultaPerfilCampesino(Integer Usucodig) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_PerfilCampesino");
            tpoDoc.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("Usucodig", Usucodig);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_PerfilCampesino)"
                    + " - Parametros: " + Usucodig
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
