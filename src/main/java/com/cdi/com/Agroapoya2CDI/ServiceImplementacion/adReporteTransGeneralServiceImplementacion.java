package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adReporteTransGeneralEntity;
import com.cdi.com.Agroapoya2CDI.Services.adReporteTransGeneralService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Service;
import org.json.JSONObject;

@Service
public class adReporteTransGeneralServiceImplementacion implements adReporteTransGeneralService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adReporteTransGeneralEntity> ConsultaRepoteTransGen(Integer bandera, String IdGrupoMilla) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_ReporteTransGeneral");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdGrupoMilla", String.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("IdGrupoMilla", IdGrupoMilla);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (admin_ReporteTransGeneral)"
                    + " - Parametros: " + bandera + "/" + IdGrupoMilla
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
