package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.MovileReporteEntregasEntity;
import com.cdi.com.Agroapoya2CDI.Services.MovileReporteEntregaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class MovileReporteEntregaServiceImplementacion implements MovileReporteEntregaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<MovileReporteEntregasEntity> ConsultaMovileReporteEntrega(Integer Bandera, Integer IdGrupo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("Movile_ReporteEntregas");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdGrupo", IdGrupo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia {Movile_ReporteEntregas}" + ex));
            return list;
        }
    }

}
