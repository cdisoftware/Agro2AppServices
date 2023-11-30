package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adSeguimientoFiltroFechaEntity;
import com.cdi.com.Agroapoya2CDI.Services.adSeguimientoFiltroFechaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adSeguimientoFiltroFechaServiceImplementacion implements adSeguimientoFiltroFechaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adSeguimientoFiltroFechaEntity> ConsultaSeguimientoFiltroFecha(adSeguimientoFiltroFechaEntity entidad, Integer Bandera, Integer IdGrupoMilla, String CdConsecutivo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_seguimientoFiltroFecha");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdGrupoMilla", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("FechaIncio", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("FechaFin", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_cnsctvo", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdGrupoMilla", IdGrupoMilla);
            tpoDoc.setParameter("FechaIncio", entidad.getFechaIncio());
            tpoDoc.setParameter("FechaFin", entidad.getFechaFin());
            tpoDoc.setParameter("Cd_cnsctvo", CdConsecutivo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia: " + ex));
            return list;
        }
    }

}
