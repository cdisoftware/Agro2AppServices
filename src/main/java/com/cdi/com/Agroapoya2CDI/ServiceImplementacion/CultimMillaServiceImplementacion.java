package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CultimMillaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CultimMillaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CultimMillaServiceImplementacion implements CultimMillaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CultimMillaEntity> ConsultaCuLtMilla(Integer Bandera, Integer cd_cnsctvo, Integer id_sector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_ultimMilla");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnsctvo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("id_sector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("cd_cnsctvo", cd_cnsctvo);
            tpoDoc.setParameter("id_sector", id_sector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_ultimMilla)"
                    + " - Parametros: " + Bandera + "/" + cd_cnsctvo + "/" + id_sector
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
