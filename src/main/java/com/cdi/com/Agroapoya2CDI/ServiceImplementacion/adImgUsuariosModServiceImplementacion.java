package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adImgUsuariosModEntity;
import com.cdi.com.Agroapoya2CDI.Services.adImgUsuariosModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adImgUsuariosModServiceImplementacion implements adImgUsuariosModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAdminImgUsuaers(adImgUsuariosModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("admin_ImgUsuariosMod");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdImagen", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("NombreImagen", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("ImgPrincipal", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Orden", Integer.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("IdImagen", entidad.getIdImagen());
            modRespuesta.setParameter("Usucodig", entidad.getUsucodig());
            modRespuesta.setParameter("NombreImagen", entidad.getNombreImagen());
            modRespuesta.setParameter("ImgPrincipal", entidad.getImgPrincipal());
            modRespuesta.setParameter("Orden", entidad.getOrden());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia: " + ex);
        }
    }

}
