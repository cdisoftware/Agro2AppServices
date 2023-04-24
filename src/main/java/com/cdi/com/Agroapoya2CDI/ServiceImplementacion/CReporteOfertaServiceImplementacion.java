package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CReporteOfertasEntity;
import com.cdi.com.Agroapoya2CDI.Services.CReporteOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CReporteOfertaServiceImplementacion implements CReporteOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CReporteOfertasEntity> CosnultaCReportOferta(CReporteOfertasEntity entidad, Integer Bandera, Integer cd_cnscutivo, Integer Id_Estado_oferta, Integer cd_producto) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_ReporteOfertas");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnscutivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Id_Estado_oferta", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("fcha_vig_ini", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("fcha_vig_fin", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_producto", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("cd_cnscutivo", cd_cnscutivo);
            tpoDoc.setParameter("Id_Estado_oferta", Id_Estado_oferta);
            tpoDoc.setParameter("fcha_vig_ini", entidad.getVIGENCIA_DESDE());
            tpoDoc.setParameter("fcha_vig_fin", entidad.getVIGENCIA_HASTA());
            tpoDoc.setParameter("cd_producto", cd_producto);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
