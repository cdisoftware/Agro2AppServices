package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ZZonaOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.ZZonaOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ZZonaOfertaModServiceImplementacion implements ZZonaOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modzZonaOferta(ZZonaOfertaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("Z_ZonaOfertaMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdZona", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);
            
            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdZona", entidad.getIdZona());
            parametros.setParameter("IdOferta", entidad.getIdOferta());
            
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (Z_ZonaOfertaMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdZona() + "/" + entidad.getIdOferta()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
