package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.THoraioTareaEntity;
import com.cdi.com.Agroapoya2CDI.Services.THoraioTareaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class THoraioTareaServiceImplementacion implements THoraioTareaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<THoraioTareaEntity> ConsultaTHorarioTarea(Integer Bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paT_HoraioTarea");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("Bandera", Bandera);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paT_HoraioTarea)"
                    + " - Parametros: " + Bandera
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
