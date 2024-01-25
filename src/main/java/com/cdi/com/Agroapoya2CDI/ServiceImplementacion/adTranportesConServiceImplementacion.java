package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adTranportesConsEntity;
import com.cdi.com.Agroapoya2CDI.Services.adTranportesConService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adTranportesConServiceImplementacion implements adTranportesConService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adTranportesConsEntity> ConsultAdmTransportesAsigna(Integer Bandera, Integer cd_cnsctivo,
            Integer idSector, String fechaDesde, String fechaHasta, String NombreTrans) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_TranportesCons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnsctivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("idSector", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("fechaDesde", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("fechaHasta", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("NombreTrans", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("cd_cnsctivo", cd_cnsctivo);
            tpoDoc.setParameter("idSector", idSector);
            tpoDoc.setParameter("fechaDesde", fechaDesde);
            tpoDoc.setParameter("fechaHasta", fechaHasta);
            tpoDoc.setParameter("NombreTrans", NombreTrans);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (admin_TranportesCons)"
                    + " - Parametros: " + Bandera + "/" + cd_cnsctivo + "/" + idSector + "/" + fechaDesde + "/" + fechaHasta + "/" + NombreTrans
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
