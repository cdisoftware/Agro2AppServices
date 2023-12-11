package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CEntregaSegEntity;
import com.cdi.com.Agroapoya2CDI.Services.CEntregaSegService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CEntregaSegServiceImplementacion implements CEntregaSegService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CEntregaSegEntity> ConsultaCEntregaSeg(Integer Bandera, Integer cd_cnscutivo, Integer IdSector) {
        try {
            StoredProcedureQuery seguimiento = repositorio.createNamedStoredProcedureQuery("paC_Consulta_Entregas_seguimiento");
            seguimiento.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            seguimiento.registerStoredProcedureParameter("cd_cnscutivo", Integer.class, ParameterMode.IN);
            seguimiento.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            seguimiento.setParameter("Bandera", Bandera);
            seguimiento.setParameter("cd_cnscutivo", cd_cnscutivo);
            seguimiento.setParameter("IdSector", IdSector);
            return seguimiento.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_Consulta_Entregas_seguimiento)"
                    + " - Parametros: " + Bandera + "/" + cd_cnscutivo + "/" + IdSector
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
