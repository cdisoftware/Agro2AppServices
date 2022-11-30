package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CPubliModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CPubliModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPubliModServiceImplementacion implements CPubliModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCpubli(CPubliModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modPublic = repositorio.createNamedStoredProcedureQuery("paC_PubliMod");
            modPublic.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("Id", Integer.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("IdVista", Integer.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("Alto", Integer.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("Ancho", Integer.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("Orden", Integer.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            modPublic.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);

            modPublic.setParameter("Bandera", Bandera);
            modPublic.setParameter("Id", entidad.getId());
            modPublic.setParameter("IdVista", entidad.getIdVista());
            modPublic.setParameter("Alto", entidad.getAlto());
            modPublic.setParameter("Ancho", entidad.getAncho());
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
