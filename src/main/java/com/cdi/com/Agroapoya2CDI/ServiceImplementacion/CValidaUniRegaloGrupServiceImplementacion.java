package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CValidaUniRegaloGrupEntity;
import com.cdi.com.Agroapoya2CDI.Services.CValidaUniRegaloGrupService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CValidaUniRegaloGrupServiceImplementacion implements CValidaUniRegaloGrupService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CValidaUniRegaloGrupEntity> ConsultaUnidadesReagalo(String codigmostrarGrupos) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_ValidaUnidadesRegaloGrupo");
            tpoDoc.registerStoredProcedureParameter("codigmostrarGrupos", String.class, ParameterMode.IN);
            tpoDoc.setParameter("codigmostrarGrupos", codigmostrarGrupos);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
