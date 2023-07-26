package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCondAsociadosOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCondAsociadosOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCondAsociadosOfertaServiceImplementacion implements CCondAsociadosOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CCondAsociadosOfertaEntity> ConsultaCondAsociadosOferta(Integer Bandera, Integer cd_cnsctivo, Integer idSector, Integer idTipoTrans) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_ConductorAsociadosOferta");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnsctivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("idSector", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("idTipoTrans", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("cd_cnsctivo", cd_cnsctivo);
            tpoDoc.setParameter("idSector", idSector);
            tpoDoc.setParameter("idTipoTrans", idTipoTrans);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
