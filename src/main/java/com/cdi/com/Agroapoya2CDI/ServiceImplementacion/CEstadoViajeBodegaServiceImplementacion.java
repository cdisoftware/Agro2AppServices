package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CEstadoViajeBodegaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CEstadoViajeBodegaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CEstadoViajeBodegaServiceImplementacion implements CEstadoViajeBodegaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CEstadoViajeBodegaEntity> ConsCEstadoViajeBodg(Integer Bandera, Integer Cd_cnctivo, Integer Id_Sector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_EstadoViajeBodega");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_cnctivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Cd_cnctivo", Cd_cnctivo);
            tpoDoc.setParameter("Id_Sector", Id_Sector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_EstadoViajeBodega)"
                    + " - Parametros: " + Bandera + "/" + Cd_cnctivo + "/" + Id_Sector
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
