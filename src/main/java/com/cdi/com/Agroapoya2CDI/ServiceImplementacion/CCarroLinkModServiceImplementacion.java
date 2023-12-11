package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCarroLinkModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCarroLinkModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCarroLinkModServiceImplementacion implements CCarroLinkModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ActualizaLinkCarro(CCarroLinkModEntity entidad, Integer Bandera, Integer IdGrupo) {
        try {
            StoredProcedureQuery ActLink = repositorio.createNamedStoredProcedureQuery("paC_CarroLinkMod");
            ActLink.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            ActLink.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            ActLink.registerStoredProcedureParameter("linkGrupo", String.class, ParameterMode.IN);

            ActLink.setParameter("Bandera", Bandera);
            ActLink.setParameter("IdGrupo", IdGrupo);
            ActLink.setParameter("linkGrupo", entidad.getLinkGrupo());

            ActLink.execute();
            return JSONObject.quote((String) ActLink.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_CarroLinkMod)"
                    + " - Parametros: " + Bandera + "/" + IdGrupo + "/" + entidad.getLinkGrupo()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
