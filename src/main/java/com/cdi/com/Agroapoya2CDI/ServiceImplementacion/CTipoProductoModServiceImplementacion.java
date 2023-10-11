package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoProductoModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTipoProductoModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTipoProductoModServiceImplementacion implements CTipoProductoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCTipoProducto(CTipoProductoModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("paC_TipoProductoMod");
            modRespuesta.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("DSCRPCION", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("imagen", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("imagenDos", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("imagenTres", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("crctzcionCrta", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("crctzcionLrga", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("ESTADO", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("CD_PRDCTO", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("PREFIJO", String.class, ParameterMode.IN);
            modRespuesta.setParameter("bandera", bandera);
            modRespuesta.setParameter("DSCRPCION", entidad.getDSCRPCION());
            modRespuesta.setParameter("imagen", entidad.getImagen());
            modRespuesta.setParameter("imagenDos", entidad.getImagenDos());
            modRespuesta.setParameter("imagenTres", entidad.getImagenTres());
            modRespuesta.setParameter("crctzcionCrta", entidad.getCrctzcionCrta());
            modRespuesta.setParameter("crctzcionLrga", entidad.getCrctzcionLrga());
            modRespuesta.setParameter("ESTADO", entidad.getESTADO());
            modRespuesta.setParameter("CD_PRDCTO", entidad.getCD_PRDCTO());
            modRespuesta.setParameter("PREFIJO", entidad.getPREFIJO());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
