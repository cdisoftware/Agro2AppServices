package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTrazabilidadEstadoOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTrazabilidadEstadoOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTrazabilidadEstadoOfertaServiceImplemenatcion implements CTrazabilidadEstadoOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CTrazabilidadEstadoOfertaEntity> ConsultaTranzEstOferta(Integer bandera, String CD_CNSCTVO) {
        try {
            StoredProcedureQuery traz = repositorio.createNamedStoredProcedureQuery("paCRrazabilidadEstadoOferta");
            traz.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            traz.registerStoredProcedureParameter("CD_CNSCTVO", String.class, ParameterMode.IN);
            traz.setParameter("bandera", bandera);
            traz.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            return traz.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
