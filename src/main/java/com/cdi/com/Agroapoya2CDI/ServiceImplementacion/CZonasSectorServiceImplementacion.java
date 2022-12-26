package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CZonasSectorEntity;
import com.cdi.com.Agroapoya2CDI.Services.CZonasSectorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CZonasSectorServiceImplementacion implements CZonasSectorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CZonasSectorEntity> ConsultaCZonasSector(CZonasSectorEntity entidad, Integer Bandera, Integer id, Integer cd_mncpio, Integer cd_dpto) {
        try {
            StoredProcedureQuery Zonas = repositorio.createNamedStoredProcedureQuery("paC_ZonasSector");
            Zonas.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            Zonas.registerStoredProcedureParameter("id", Integer.class, ParameterMode.IN);
            Zonas.registerStoredProcedureParameter("cd_mncpio", Integer.class, ParameterMode.IN);
            Zonas.registerStoredProcedureParameter("cd_dpto", Integer.class, ParameterMode.IN);
            Zonas.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            Zonas.setParameter("Bandera", Bandera);
            Zonas.setParameter("id", id);
            Zonas.setParameter("cd_mncpio", cd_mncpio);
            Zonas.setParameter("cd_dpto", cd_dpto);
            Zonas.setParameter("Descripcion", entidad.getDescripcion());
            return Zonas.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
