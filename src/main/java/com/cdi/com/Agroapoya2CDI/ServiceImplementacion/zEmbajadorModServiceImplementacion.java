package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zEmbajadorModEntity;
import com.cdi.com.Agroapoya2CDI.Services.zEmbajadorModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zEmbajadorModServiceImplementacion implements zEmbajadorModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modzEmbajador(Integer Bandera, zEmbajadorModEntity Entidad) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_EmbajadorMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("UsucodigEmbajador", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("CorreoEmbajado", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("NombreConjunto", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("ComplementoDireccion", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Coordenadas", String.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("UsucodigEmbajador", Entidad.getUsucodigEmbajador());
            parametros.setParameter("CorreoEmbajado", Entidad.getCorreoEmbajado());
            parametros.setParameter("NombreConjunto", Entidad.getNombreConjunto());
            parametros.setParameter("Direccion", Entidad.getDireccion());
            parametros.setParameter("ComplementoDireccion", Entidad.getComplementoDireccion());
            parametros.setParameter("Coordenadas", Entidad.getCoordenadas());
            
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_EmbajadorMod)"
                    + " - Parametros: " + Bandera + "/" + Entidad.getUsucodigEmbajador() + "/" + Entidad.getCorreoEmbajado() + "/" + Entidad.getNombreConjunto() + "/" +
                   Entidad.getDireccion() + "/" + Entidad.getComplementoDireccion() + "/" + Entidad.getCoordenadas() + "/"
                    + " - ERROR JAVA = " + ex);
        }
    }

}
