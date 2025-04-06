package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zDuplicarOfertamodEntity;
import com.cdi.com.Agroapoya2CDI.Services.zDuplicarOfertamodService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zDuplicarOfertamodServiceImplementacion implements zDuplicarOfertamodService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modDuplicarOferta(Integer Bandera, zDuplicarOfertamodEntity Entidad) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_DuplicarOferta_mod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("FechaInicio", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("FechaFin", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("FechaEntrega", String.class, ParameterMode.IN);
            
            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdOferta", Entidad.getIdOferta());
            parametros.setParameter("FechaInicio", Entidad.getFechaInicio());
            parametros.setParameter("FechaFin", Entidad.getFechaFin());
            parametros.setParameter("FechaEntrega", Entidad.getFechaEntrega());
            
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_DuplicarOferta_mod)"
                    + " - Parametros: " + Bandera + "/" + Entidad.getIdOferta() + "/" + Entidad.getFechaInicio() + "/" + Entidad.getFechaFin() + "/" + Entidad.getFechaEntrega()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
