package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ZembajadorVecinosReporteEntity;
import com.cdi.com.Agroapoya2CDI.Services.ZembajadorVecinosReporteService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ZembajadorVecinosReporteServiceImplementacion implements ZembajadorVecinosReporteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ZembajadorVecinosReporteEntity> consEmbajadorVecinosReporte(Integer Bandera, Integer UsucodigEmbajador) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("Z_embajadorVecinosReporte");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("UsucodigEmbajador", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("UsucodigEmbajador", UsucodigEmbajador);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (Z_embajadorVecinosReporte)"
                    + " - Parametros: " + Bandera + "/" + Bandera + "/" + UsucodigEmbajador 
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
