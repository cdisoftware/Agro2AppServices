package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zTipoZonaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.zTipoZonaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zTipoZonaModServiceImplementacion implements zTipoZonaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modTipoZona(Integer Bandera, zTipoZonaModEntity Entidad) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_TipoZona_Mod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdLocalidad", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoEstado", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdSector", Entidad.getIdSector());
            parametros.setParameter("IdLocalidad", Entidad.getIdLocalidad());
            parametros.setParameter("Descripcion", Entidad.getDescripcion());
            parametros.setParameter("TipoEstado", Entidad.getTipoEstado());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_TipoZona_Mod)"
                    + " - Parametros: " + Bandera + "/" + Entidad.getIdSector() + "/" + Entidad.getIdLocalidad() + "/" + Entidad.getDescripcion() + "/" + Entidad.getTipoEstado()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
