package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.admin_segValoresTotalesEntity;
import com.cdi.com.Agroapoya2CDI.Services.admin_segValoresTotalesService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class admin_segValoresTotalesServiceImplementacion implements admin_segValoresTotalesService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<admin_segValoresTotalesEntity> conscalculadora(Integer Bandera, Integer IdGrupo) {
        try {
            StoredProcedureQuery Cons = repositorio.createNamedStoredProcedureQuery("admin_segValoresTotales");
            Cons.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            Cons.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);

            Cons.setParameter("Bandera", Bandera);
            Cons.setParameter("IdGrupo", IdGrupo);

            return Cons.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (admin_segValoresTotales)"
                    + " - Parametros: " + Bandera + "/" + IdGrupo
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
