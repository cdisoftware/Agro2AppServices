package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adlistaLocalidadesEntity;
import com.cdi.com.Agroapoya2CDI.Services.adlistaLocalidadeService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adlistaLocalidadeServiceImplementacion implements adlistaLocalidadeService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adlistaLocalidadesEntity> ConsultaLocalidades(Integer Bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_listaLocalidades");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("Bandera", Bandera);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (admin_listaLocalidades)"
                    + " - Parametros: " + Bandera
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
