package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zTipoCoordenadasZonaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.zTipoCoordenadasZonaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zTipoCoordenadasZonaModServiceImplementacion implements zTipoCoordenadasZonaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modTipoCoordenadasZona(Integer Bandera, zTipoCoordenadasZonaModEntity Entidad) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_TipoCoordenadas_Zona_Mod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Id", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdZona", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Latitud", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Longitud", String.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("Id", Entidad.getId());
            parametros.setParameter("IdZona", Entidad.getIdZona());
            parametros.setParameter("Latitud", Entidad.getLatitud());
            parametros.setParameter("Longitud", Entidad.getLongitud());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_TipoCoordenadas_Zona_Mod)"
                    + " - Parametros: " + Bandera + "/" + Entidad.getId() + "/" + Entidad.getIdZona() + "/" + Entidad.getLatitud() + "/" + Entidad.getLongitud()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
