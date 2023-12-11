package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adreporteVentasEntity;
import com.cdi.com.Agroapoya2CDI.Services.adreporteVentaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adreporteVentaServiceImplementacion implements adreporteVentaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adreporteVentasEntity> ConsultaAdminReporteVentas(adreporteVentasEntity entidad, Integer Bandera,
            Integer cd_cnscutivo, Integer IdSector, Integer Id_Estado_Compra, Integer Id_Estado_pago) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_reporteVentas");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnscutivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Id_Estado_Compra", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Id_Estado_pago", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("fcha_compra_ini", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("fcha_compra_fin", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("cd_cnscutivo", cd_cnscutivo);
            tpoDoc.setParameter("IdSector", IdSector);
            tpoDoc.setParameter("Id_Estado_Compra", Id_Estado_Compra);
            tpoDoc.setParameter("Id_Estado_pago", Id_Estado_pago);
            tpoDoc.setParameter("fcha_compra_ini", entidad.getFcha_compra_ini());
            tpoDoc.setParameter("fcha_compra_fin", entidad.getFcha_compra_fin());

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (admin_reporteVentas)"
                    + " - Parametros: " + Bandera + "/" + cd_cnscutivo + "/" + IdSector + "/" + Id_Estado_Compra + "/"
                    + Id_Estado_pago + "/" + entidad.getFcha_compra_ini() + "/"
                    + entidad.getFcha_compra_fin()
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
