package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adreporteTransportEntity;
import com.cdi.com.Agroapoya2CDI.Services.adreporteTransporteService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adreporteTransporteServiceImplementacion implements adreporteTransporteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adreporteTransportEntity> ConsultaReporteTransport(Integer Bandera, String IdsOferta, String IdsGrupo, String FechaIncio, String FechaFin) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_reporteTransporte");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdsOferta", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdsGrupo", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("FechaIncio", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("FechaFin", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdsOferta", IdsOferta);
            tpoDoc.setParameter("IdsGrupo", IdsGrupo);
            tpoDoc.setParameter("FechaIncio", FechaIncio);
            tpoDoc.setParameter("FechaFin", FechaFin);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (admin_reporteTransporte)"
                    + " - Parametros: " + Bandera + "/" + IdsOferta + "/" + IdsGrupo + "/" + FechaIncio + "/" + FechaFin
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
