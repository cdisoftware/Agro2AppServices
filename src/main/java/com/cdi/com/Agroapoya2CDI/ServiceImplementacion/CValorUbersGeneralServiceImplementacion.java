package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CValorUbersGeneralEntity;
import com.cdi.com.Agroapoya2CDI.Services.CValorUbersGeneralService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CValorUbersGeneralServiceImplementacion implements CValorUbersGeneralService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CValorUbersGeneralEntity> consultaCValorUbersGen(Integer Bandera, Integer IdeDepto, Integer IdCiudad) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_ValorUbersGeneral");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdeDepto", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdCiudad", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdeDepto", IdeDepto);
            tpoDoc.setParameter("IdCiudad", IdCiudad);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_ValorUbersGeneral)"
                    + " - Parametros: " + Bandera + "/" + IdeDepto + "/" + IdCiudad
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
