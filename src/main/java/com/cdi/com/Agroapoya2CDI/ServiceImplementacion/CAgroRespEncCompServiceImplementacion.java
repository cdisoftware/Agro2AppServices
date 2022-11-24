package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroRespEncCompEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAgroRespEncCompService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAgroRespEncCompServiceImplementacion implements CAgroRespEncCompService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CAgroRespEncCompEntity> ConsultaCAgroRespEncComp(Integer bandera, String ID_COMPRA) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paCAgro_Respuesta_Encuesta_Compra");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("ID_COMPRA", String.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("ID_COMPRA", ID_COMPRA);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
