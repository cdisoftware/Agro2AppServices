package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CLinksCPyGModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CLinksCPyGModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CLinksCPyGModServiceImplementacion implements CLinksCPyGModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCLinksCPyG(CLinksCPyGModEntity entidad, Integer BANDERA) {
        try {
            StoredProcedureQuery modPyG = repositorio.createNamedStoredProcedureQuery("paCLinksCPyGMod");
            modPyG.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            modPyG.registerStoredProcedureParameter("PRFJO_URL", String.class, ParameterMode.IN);
            modPyG.registerStoredProcedureParameter("LINK_LARGO", String.class, ParameterMode.IN);
            modPyG.registerStoredProcedureParameter("COD_DCTO", String.class, ParameterMode.IN);
            modPyG.registerStoredProcedureParameter("TPO_LINK", String.class, ParameterMode.IN);

            modPyG.setParameter("BANDERA", BANDERA);
            modPyG.setParameter("PRFJO_URL", entidad.getPRFJO_URL());
            modPyG.setParameter("LINK_LARGO", entidad.getLINK_LARGO());
            modPyG.setParameter("COD_DCTO", entidad.getCOD_DCTO());
            modPyG.setParameter("TPO_LINK", entidad.getTPO_LINK());

            modPyG.execute();
            return JSONObject.quote((String) modPyG.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paCLinksCPyGMod)"
                    + " - Parametros: " + BANDERA + "/" + entidad.getPRFJO_URL() + "/" + entidad.getLINK_LARGO() + "/" + entidad.getCOD_DCTO() + "/" + entidad.getTPO_LINK()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
