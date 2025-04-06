package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zcuponesDescuentomodeEntity;
import com.cdi.com.Agroapoya2CDI.Services.zcuponesDescuentomodeServices;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zcuponesDescuentomodeServicesImplementacion implements zcuponesDescuentomodeServices {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modCuponesDescuento(Integer Bandera, zcuponesDescuentomodeEntity Entidad) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_cuponesDescuento_mod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdCupon", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdTipoCupon", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("CodigoMostrar", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("DescuentoAplicable", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("ApartirValor", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoPersonaAplicable", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("FechaInicio", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("FechaFin", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoEstado", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("ScriptAdicional", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdRegalo", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdCupon", Entidad.getIdCupon());
            parametros.setParameter("IdTipoCupon", Entidad.getIdTipoCupon());
            parametros.setParameter("CodigoMostrar", Entidad.getCodigoMostrar());
            parametros.setParameter("Descripcion", Entidad.getDescripcion());
            parametros.setParameter("DescuentoAplicable", Entidad.getDescuentoAplicable());
            parametros.setParameter("ApartirValor", Entidad.getApartirValor());
            parametros.setParameter("TipoPersonaAplicable", Entidad.getTipoPersonaAplicable());
            parametros.setParameter("FechaInicio", Entidad.getFechaInicio());
            parametros.setParameter("FechaFin", Entidad.getFechaFin());
            parametros.setParameter("TipoEstado", Entidad.getTipoEstado());
            parametros.setParameter("IdOferta", Entidad.getIdOferta());
            parametros.setParameter("ScriptAdicional", Entidad.getScriptAdicional());
            parametros.setParameter("IdRegalo", Entidad.getIdRegalo());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_cuponesDescuento_mod)"
                    + " - Parametros: " + Bandera + "/" + Entidad.getIdCupon() + "/" + Entidad.getIdTipoCupon() + "/" + Entidad.getCodigoMostrar() + "/" + Entidad.getDescripcion() + "/"
                    + Entidad.getDescuentoAplicable() + "/" + Entidad.getApartirValor() + "/" + Entidad.getTipoPersonaAplicable() + "/" + Entidad.getFechaInicio() + "/" + Entidad.getFechaFin() + "/"
                    + Entidad.getTipoEstado() + "/" + Entidad.getIdOferta() + "/" + Entidad.getScriptAdicional() + "/" + Entidad.getIdRegalo()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
