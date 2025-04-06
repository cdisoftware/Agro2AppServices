package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zTipoCoordenadasZonaModDosEntity;
import com.cdi.com.Agroapoya2CDI.Services.zTipoCoordenadasZonaModDosService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zTipoCoordenadasZonaModDosServiceImplementacion implements zTipoCoordenadasZonaModDosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modTipoCoordenadasZonaDos(Integer Bandera, zTipoCoordenadasZonaModDosEntity Entidad) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_TipoCoordenadas_ZonaMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdZona", Integer.class, ParameterMode.IN);
            
            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdZona", Entidad.getIdZona());
            
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_TipoCoordenadas_ZonaMod)"
                    + " - Parametros: " + Bandera + "/" + Entidad.getIdZona()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
