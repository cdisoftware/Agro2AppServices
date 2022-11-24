package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CPublicidadModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CPublicidadModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPublicidadModServiceImplementacion implements CPublicidadModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCPublicidad(CPublicidadModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modPublic = repositorio.createNamedStoredProcedureQuery("paC_PublicidadMod");
            modPublic.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("Id", Integer.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("IdVista", Integer.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("IdAccion", Integer.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("Patch", String.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("Orden", Integer.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);

            modPublic.setParameter("Bandera", Bandera);
            modPublic.setParameter("Id", entidad.getId());
            modPublic.setParameter("IdVista", entidad.getIdVista());
            modPublic.setParameter("IdAccion", entidad.getIdAccion());
            modPublic.setParameter("Patch", entidad.getPatch());
            modPublic.setParameter("Imagen", entidad.getImagen());
            modPublic.setParameter("Orden", entidad.getOrden());
            modPublic.setParameter("Usucodig", entidad.getUsucodig());
            modPublic.setParameter("Observacion", entidad.getObservacion());

            modPublic.execute();
            return JSONObject.quote((String) modPublic.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
