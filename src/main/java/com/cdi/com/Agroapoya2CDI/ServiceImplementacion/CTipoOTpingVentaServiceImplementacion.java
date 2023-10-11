package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoOTpingVentaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTipoOTpingVentaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTipoOTpingVentaServiceImplementacion implements CTipoOTpingVentaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CTipoOTpingVentaEntity> ConsultaCTipoOTpingVenta(Integer Bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("pac_TipoOTpingVenta");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("Bandera", Bandera);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
