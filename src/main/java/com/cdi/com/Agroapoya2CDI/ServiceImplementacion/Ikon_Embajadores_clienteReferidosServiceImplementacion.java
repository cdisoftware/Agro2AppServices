
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.Ikon_Embajadores_clienteReferidosEntity;
import com.cdi.com.Agroapoya2CDI.Services.Ikon_Embajadores_clienteReferidosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class Ikon_Embajadores_clienteReferidosServiceImplementacion implements Ikon_Embajadores_clienteReferidosService{

    @PersistenceContext
    private EntityManager repositorio;
    
    @Override
    public List<Ikon_Embajadores_clienteReferidosEntity> ConsultaEmbajadoresReferidosIkon(Integer IdEmbajador) {
       try {
            StoredProcedureQuery param = repositorio.createNamedStoredProcedureQuery("Ikon_Embajadores_clienteReferidos");
            param.registerStoredProcedureParameter("IdUsuarioEmbajador", Integer.class, ParameterMode.IN);
            
             param.setParameter("IdUsuarioEmbajador", IdEmbajador);

            return param.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (Ikon_Embajadores_clienteReferidos)"
                    + " - Parametros: "  + IdEmbajador
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
    
}
