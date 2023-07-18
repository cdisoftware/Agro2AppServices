package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.pa_CTextosOfertaConsultaEntity;
import com.cdi.com.Agroapoya2CDI.Services.pa_CTextosOfertaConsultaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class pa_CTextosOfertaConsultaServiceImplementacion implements pa_CTextosOfertaConsultaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<pa_CTextosOfertaConsultaEntity> ConsTextyOfer(Integer Bandera, Integer idSector, Integer cd_cnctivo) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("pa_CTextosOfertaConsulta");
            respu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("idSector", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("cd_cnctivo", Integer.class, ParameterMode.IN);

            respu.setParameter("Bandera", Bandera);
            respu.setParameter("idSector", idSector);
            respu.setParameter("cd_cnctivo", cd_cnctivo);
            return respu.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
