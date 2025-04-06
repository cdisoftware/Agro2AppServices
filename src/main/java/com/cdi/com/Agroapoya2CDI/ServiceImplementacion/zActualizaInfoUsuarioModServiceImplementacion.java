package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zActualizaInfoUsuarioModEntity;
import com.cdi.com.Agroapoya2CDI.Services.zActualizaInfoUsuarioModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zActualizaInfoUsuarioModServiceImplementacion implements zActualizaInfoUsuarioModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modActualizaInfoUsuario(Integer Bandera, zActualizaInfoUsuarioModEntity Entidad) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_ActualizaInfoUsuarioMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("NombrePersona", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("ComplementoDireccion", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Coordenadas", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("UsuarioTraza", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Correo", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Celular", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("id_manychat", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdUsuario", Entidad.getIdUsuario());
            parametros.setParameter("NombrePersona", Entidad.getNombrePersona());
            parametros.setParameter("Direccion", Entidad.getDireccion());
            parametros.setParameter("ComplementoDireccion", Entidad.getComplementoDireccion());
            parametros.setParameter("Coordenadas", Entidad.getCoordenadas());
            parametros.setParameter("UsuarioTraza", Entidad.getUsuarioTraza());
            parametros.setParameter("Correo", Entidad.getCorreo());
            parametros.setParameter("Celular", Entidad.getCelular());
            parametros.setParameter("id_manychat", Entidad.getId_manychat());
            parametros.setParameter("Observacion", Entidad.getObservacion());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_ActualizaInfoUsuarioMod)"
                    + " - Parametros: " + Bandera + "/" + Entidad.getIdUsuario() + "/" + Entidad.getNombrePersona() + "/" + Entidad.getDireccion() + "/" + Entidad.getComplementoDireccion() + "/"
                    + Entidad.getCoordenadas() + "/" + Entidad.getUsuarioTraza() + "/" + Entidad.getCorreo() + "/" + Entidad.getCelular() + "/" + Entidad.getId_manychat() + "/" + Entidad.getObservacion()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
