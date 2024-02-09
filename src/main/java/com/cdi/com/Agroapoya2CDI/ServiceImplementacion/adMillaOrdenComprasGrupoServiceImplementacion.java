package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adMillaOrdenComprasGrupoEntity;
import com.cdi.com.Agroapoya2CDI.Services.adMillaOrdenComprasGrupoService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adMillaOrdenComprasGrupoServiceImplementacion implements adMillaOrdenComprasGrupoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAdmillaOrdenComprasGrupo(adMillaOrdenComprasGrupoEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("admin_MillaOrdenComprasGrupo");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("CadenaOrden", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("CadenaOrden", entidad.getCadenaOrden());
            modRespuesta.setParameter("IdGrupo", entidad.getIdGrupo());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_MillaOrdenComprasGrupo)"
                    + " - Parametros: " + Bandera + "/" + entidad.getCadenaOrden() + "/" + entidad.getIdGrupo()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
