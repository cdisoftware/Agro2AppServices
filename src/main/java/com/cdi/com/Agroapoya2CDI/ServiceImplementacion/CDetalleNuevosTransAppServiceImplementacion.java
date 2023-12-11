package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CDetalleNuevosTransAppEntity;
import com.cdi.com.Agroapoya2CDI.Services.CDetalleNuevosTransAppService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CDetalleNuevosTransAppServiceImplementacion implements CDetalleNuevosTransAppService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CDetalleNuevosTransAppEntity> consultaCdtlleNewTransApp(Integer Bandera, Integer Cd_cnsctvo, Integer Id_grupo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_DetalleNuevosTransApp");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_cnsctvo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Id_grupo", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Cd_cnsctvo", Cd_cnsctvo);
            tpoDoc.setParameter("Id_grupo", Id_grupo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_DetalleNuevosTransApp)"
                    + " - Parametros: " + Bandera + "/" + Cd_cnsctvo + "/" + Id_grupo
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
