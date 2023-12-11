package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroValidaEncuestaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAgroValidaEncuestaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAgroValidaEncuestaServiceImplementacion implements CAgroValidaEncuestaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CAgroValidaEncuestaEntity> ConsultaCAgroValEncuestas(Integer bandera, String ID_COMPRA) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paCAgro_valida_encuesta");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("ID_COMPRA", String.class, ParameterMode.IN);
            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("ID_COMPRA", ID_COMPRA);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paCAgro_valida_encuesta)"
                    + " - Parametros: " + bandera + "/" + ID_COMPRA
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
