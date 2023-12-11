package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CLinksModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CLinksModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CLinksModServiceImplementacion implements CLinksModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCLinks(CLinksModEntity entidad, Integer BANDERA) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("paCLinksMod");
            insertbackup.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("PRFJO_URL", String.class, ParameterMode.IN);

            insertbackup.setParameter("BANDERA", BANDERA);
            insertbackup.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            insertbackup.setParameter("PRFJO_URL", entidad.getPRFJO_URL());

            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paCLinksMod)"
                    + " - Parametros: " + BANDERA + "/" + entidad.getCD_CNSCTVO() + "/" + entidad.getPRFJO_URL()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
