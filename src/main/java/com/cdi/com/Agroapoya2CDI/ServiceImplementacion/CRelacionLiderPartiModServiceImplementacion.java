package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CRelacionLiderPartiModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionLiderPartiModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CRelacionLiderPartiModServiceImplementacion implements CRelacionLiderPartiModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModRelacionLiderPart(CRelacionLiderPartiModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery ModRelaLider = repositorio.createNamedStoredProcedureQuery("paC_RelacionLiderPartiMod");
            ModRelaLider.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            ModRelaLider.registerStoredProcedureParameter("IdCarroLider", Integer.class, ParameterMode.IN);
            ModRelaLider.registerStoredProcedureParameter("IdCarroParticipante", Integer.class, ParameterMode.IN);
            ModRelaLider.setParameter("Bandera", Bandera);
            ModRelaLider.setParameter("IdCarroLider", entidad.getIdCarroLider());
            ModRelaLider.setParameter("IdCarroParticipante", entidad.getIdCarroParticipante());
            ModRelaLider.execute();
            return JSONObject.quote((String) ModRelaLider.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_RelacionLiderPartiMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdCarroLider() + "/" + entidad.getIdCarroParticipante()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
