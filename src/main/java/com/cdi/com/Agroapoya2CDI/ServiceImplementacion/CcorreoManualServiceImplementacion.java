package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CcorreoManualEntity;
import com.cdi.com.Agroapoya2CDI.Services.CcorreoManualService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CcorreoManualServiceImplementacion implements CcorreoManualService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CcorreoManualEntity> ConsultaCorreos(Integer Bandera, Integer IdEnvio, Integer IdSector, Integer Cd_cnctivo, Integer IdPlantilla, Integer IdEstado, String fecha) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("paC_correoManual");
            respu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("IdEnvio", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("Cd_cnctivo", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("IdEstado", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("fecha", String.class, ParameterMode.IN);

            respu.setParameter("Bandera", Bandera);
            respu.setParameter("IdEnvio", IdEnvio);
            respu.setParameter("IdSector", IdSector);
            respu.setParameter("Cd_cnctivo", Cd_cnctivo);
            respu.setParameter("IdPlantilla", IdPlantilla);
            respu.setParameter("IdEstado", IdEstado);
            respu.setParameter("fecha", fecha);

            return respu.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_correoManual)"
                    + " - Parametros: " + Bandera + "/" + IdEnvio + "/" + IdSector + "/"
                    + Cd_cnctivo + "/" + IdPlantilla + "/" + IdEstado + "/"
                    + fecha
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
