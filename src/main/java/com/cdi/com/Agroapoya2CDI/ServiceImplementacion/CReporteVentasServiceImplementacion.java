package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CReporteVentasEntity;
import com.cdi.com.Agroapoya2CDI.Services.CReporteVentasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CReporteVentasServiceImplementacion implements CReporteVentasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CReporteVentasEntity> ConsultaCReporteVentas(Integer Bandera, Integer cd_cnscutivo, Integer IdSector, Integer Id_Estado_Compra, Integer Id_Estado_pago) {
        try {
            StoredProcedureQuery repotVentas = repositorio.createNamedStoredProcedureQuery("paC_ReporteVentas");
            repotVentas.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            repotVentas.registerStoredProcedureParameter("cd_cnscutivo", Integer.class, ParameterMode.IN);
            repotVentas.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            repotVentas.registerStoredProcedureParameter("Id_Estado_Compra", Integer.class, ParameterMode.IN);
            repotVentas.registerStoredProcedureParameter("Id_Estado_pago", Integer.class, ParameterMode.IN);

            repotVentas.setParameter("Bandera", Bandera);
            repotVentas.setParameter("cd_cnscutivo", cd_cnscutivo);
            repotVentas.setParameter("IdSector", IdSector);
            repotVentas.setParameter("Id_Estado_Compra", Id_Estado_Compra);
            repotVentas.setParameter("Id_Estado_pago", Id_Estado_pago);

            return repotVentas.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
