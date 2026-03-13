
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.sp_ReporteVecinoConjuntosEntity;
import com.cdi.com.Agroapoya2CDI.Services.sp_ReporteVecinoConjuntosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class sp_ReporteVecinoConjuntosServiceImplementacion implements sp_ReporteVecinoConjuntosService {

    @PersistenceContext
    private EntityManager repositorio;
    
    @Override
    public List<sp_ReporteVecinoConjuntosEntity> ConsultaVecino(Integer Bandera, Integer IdEmbajador, String correoEmbajador, Integer IdVecino, String correoVecino) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("sp_ReporteVecinoConjuntos");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdEmbajador", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("correoEmbajador", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdVecino", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("correoVecino", String.class, ParameterMode.IN);
            
            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdEmbajador", IdEmbajador);
            tpoDoc.setParameter("correoEmbajador", correoEmbajador);
            tpoDoc.setParameter("IdVecino", IdVecino);
            tpoDoc.setParameter("correoVecino", correoVecino);
            
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (sp_ReporteVecinoConjuntos)"
                    + " - Parametros: " + Bandera + "/" + IdEmbajador + "/" + correoEmbajador+ "/" + IdVecino + "/" + correoVecino
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
    
}
