
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.sp_ConsultarPagosPorEmbajadorEntity;
import com.cdi.com.Agroapoya2CDI.Services.sp_ConsultarPagosPorEmbajadorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class sp_ConsultarPagosPorEmbajadorServiceImplementacion implements sp_ConsultarPagosPorEmbajadorService {

    @PersistenceContext
    private EntityManager repositorio;
    
    @Override
    public List<sp_ConsultarPagosPorEmbajadorEntity> ConsultaRelacionEmbajador(Integer Bandera, String UsucodigEmbajador, String UsucodigVecino) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("sp_ConsultarPagosPorEmbajador");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("UsucodigEmbajador", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("UsucodigVecino", String.class, ParameterMode.IN);

            
            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("UsucodigEmbajador", UsucodigEmbajador);
            tpoDoc.setParameter("UsucodigVecino", UsucodigVecino);

            
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (sp_ReporteVecinoConjuntos)"
                    + " - Parametros: " + Bandera + "/" + UsucodigEmbajador + "/" + UsucodigVecino
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
    
}
