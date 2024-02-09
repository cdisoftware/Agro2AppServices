package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adMillaGruposFocoModEntity;
import com.cdi.com.Agroapoya2CDI.Services.adMillaGruposFocoModService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adMillaGruposFocoModServiceImplementacion implements adMillaGruposFocoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String AdGruposFocoMod(adMillaGruposFocoModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_millaGruposFocoMod");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdCarros", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdGrupo", entidad.getIdGrupo());
            tpoDoc.setParameter("IdCarros", entidad.getIdCarros());

            tpoDoc.execute();
            return JSONObject.quote((String) tpoDoc.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_millaGruposFocoMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdGrupo() + "/" + entidad.getIdCarros()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
