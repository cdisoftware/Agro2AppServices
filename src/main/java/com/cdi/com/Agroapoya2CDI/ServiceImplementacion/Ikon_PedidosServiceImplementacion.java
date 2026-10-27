
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.Ikon_PedidosEntity;
import com.cdi.com.Agroapoya2CDI.Services.Ikon_PedidosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class Ikon_PedidosServiceImplementacion implements Ikon_PedidosService{

    @PersistenceContext
    private EntityManager repositorio;
    
    @Override
    public List<Ikon_PedidosEntity> ConsultaPedidosIkon(Integer Meses) {
        try {
            StoredProcedureQuery param = repositorio.createNamedStoredProcedureQuery("Ikon_Pedidos");
            param.registerStoredProcedureParameter("Meses", Integer.class, ParameterMode.IN);
            
             param.setParameter("Meses", Meses);

            return param.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (Ikon_Pedidos)"
                    + " - Parametros: "  + Meses
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
    
}
