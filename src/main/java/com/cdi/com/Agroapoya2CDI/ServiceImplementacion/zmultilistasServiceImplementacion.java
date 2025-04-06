package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zmultilistasEntity;
import com.cdi.com.Agroapoya2CDI.Services.zmultilistasServices;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zmultilistasServiceImplementacion implements zmultilistasServices {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zmultilistasEntity> consMultilistas(Integer Bandera, String FiltroUno, String FiltroDos) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_multilistas");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("FiltroUno", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("FiltroDos", String.class, ParameterMode.IN);
            
            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("FiltroUno", FiltroUno);
            tpoDoc.setParameter("FiltroDos", FiltroDos);
            
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_multilistas)"
                    + " - Parametros: " + Bandera + "/" + FiltroUno + "/" + FiltroDos
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
