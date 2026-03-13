
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.sp_ReporteEmbajadoresConjuntosEntity;
import com.cdi.com.Agroapoya2CDI.Services.sp_ReporteEmbajadoresConjuntosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class sp_ReporteEmbajadoresConjuntosServiceImplementacion implements sp_ReporteEmbajadoresConjuntosService {

    @PersistenceContext
    private EntityManager repositorio;
    
    @Override
    public List<sp_ReporteEmbajadoresConjuntosEntity> ConsultaEmbajador(Integer Bandera, Integer IdEmbajador, String correoEmbajador) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("sp_ReporteEmbajadoresConjuntos");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdEmbajador", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("correoEmbajador", String.class, ParameterMode.IN);
            
            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdEmbajador", IdEmbajador);
            tpoDoc.setParameter("correoEmbajador", correoEmbajador);
            
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (sp_ReporteEmbajadoresConjuntos)"
                    + " - Parametros: " + Bandera + "/" + IdEmbajador + "/" + correoEmbajador
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
    
}
