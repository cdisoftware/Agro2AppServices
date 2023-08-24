package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCodigosDescuentoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCodigosDescuentoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCodigosDescuentoServiceImplementacion implements CCodigosDescuentoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CCodigosDescuentoEntity> ConsultaCodigosDescuentos(CCodigosDescuentoEntity entidad, Integer Bandera,
            Integer agro_tipoCuponDescuentoGeneral, Integer IdTipoCuponCodigoAplicableGeneral, Integer Cd_cnsctvo, Integer Estado) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_CodigosDescuento");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("agro_tipoCuponDescuentoGeneral", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdTipoCuponCodigoAplicableGeneral", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_cnsctvo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("FechaCreacion", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("agro_tipoCuponDescuentoGeneral", agro_tipoCuponDescuentoGeneral);
            tpoDoc.setParameter("IdTipoCuponCodigoAplicableGeneral", IdTipoCuponCodigoAplicableGeneral);
            tpoDoc.setParameter("Cd_cnsctvo", Cd_cnsctvo);
            tpoDoc.setParameter("FechaCreacion", entidad.getFechaCreacion());
            tpoDoc.setParameter("Estado", Estado);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
