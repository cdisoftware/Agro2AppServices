package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zOfertaRegalosModEntity;
import com.cdi.com.Agroapoya2CDI.Services.zOfertaRegalosModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zOfertaRegalosModServiceImplementacion implements zOfertaRegalosModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modOfertaRegalos(zOfertaRegalosModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_OfertaRegalos_Mod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdTipoRegalo", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("AplicablePersona", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoEstado", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdOferta", entidad.getIdOferta());
            parametros.setParameter("IdTipoRegalo", entidad.getIdTipoRegalo());
            parametros.setParameter("AplicablePersona", entidad.getAplicablePersona());
            parametros.setParameter("TipoEstado", entidad.getTipoEstado());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));

        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_OfertaRegalos_Mod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdOferta() + "/" + entidad.getIdTipoRegalo()+ "/" + entidad.getAplicablePersona() + "/" + entidad.getTipoEstado()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
