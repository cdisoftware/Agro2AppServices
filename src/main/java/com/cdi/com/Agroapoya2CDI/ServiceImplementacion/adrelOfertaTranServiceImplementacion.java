package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adrelOfertaTransEntity;
import com.cdi.com.Agroapoya2CDI.Services.adrelOfertaTranService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adrelOfertaTranServiceImplementacion implements adrelOfertaTranService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adrelOfertaTransEntity> ConsrelaOfertaTrans(Integer Bandera, Integer idTrans) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_relacion_Oferta_Trans");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("idTrans", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("idTrans", idTrans);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (admin_relacion_Oferta_Trans)"
                    + " - Parametros: " + Bandera + "/" + idTrans
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
