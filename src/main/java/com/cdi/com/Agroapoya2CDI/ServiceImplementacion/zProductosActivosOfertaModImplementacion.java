package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zProductosActivosOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.zProductosActivosOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zProductosActivosOfertaModImplementacion implements zProductosActivosOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modProductosActivosOferta(zProductosActivosOfertaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_ProductosActivosOferta_Mod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoProducto", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Orden", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoEstado", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("UsucodigProductor", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdOferta", entidad.getIdOferta());
            parametros.setParameter("TipoProducto", entidad.getTipoProducto());
            parametros.setParameter("Orden", entidad.getOrden());
            parametros.setParameter("TipoEstado", entidad.getTipoEstado());
            parametros.setParameter("UsucodigProductor", entidad.getUsucodigProductor());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));

        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_ProductosActivosOferta_Mod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdOferta() + "/" + entidad.getTipoProducto() + "/" + entidad.getOrden() +
                    "/" + entidad.getTipoEstado() + "/" + entidad.getUsucodigProductor()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
