package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adDireccionUsuModEntity;
import com.cdi.com.Agroapoya2CDI.Services.adDireccionUsuModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adDireccionUsuModServiceImplementacion implements adDireccionUsuModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModadDireccionUsu(adDireccionUsuModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("admin_DireccionUsuMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("CompleDirecc", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Coordenadas", String.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("Usucodig", entidad.getUsucodig());
            parametros.setParameter("Direccion", entidad.getDireccion());
            parametros.setParameter("CompleDirecc", entidad.getCompleDirecc());
            parametros.setParameter("Coordenadas", entidad.getCoordenadas());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_DireccionUsuMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getUsucodig() + "/"
                    + entidad.getDireccion() + "/" + entidad.getCompleDirecc() + "/" + entidad.getCoordenadas()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
