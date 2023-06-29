package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CPerfilCampesinoModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CPerfilCampesinoModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPerfilCampesinoModServiceImplementacion implements CPerfilCampesinoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModPerfilCampesino(CPerfilCampesinoModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("paC_PerfilCampesinoMod");
            insertbackup.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("CorreoPersona", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("NombrePersona", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("ApellidoPersona", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("CelularPersona", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("TipoDocumento", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("DocumentoUsuario", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdDepto", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdCiudad", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Comentario", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("complementoDireccion", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdManychat", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("DescripUno", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("DescripDos", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("DescripTres", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);

            insertbackup.setParameter("Bandera", Bandera);
            insertbackup.setParameter("Usucodig", entidad.getUsucodig());
            insertbackup.setParameter("CorreoPersona", entidad.getCorreoPersona());
            insertbackup.setParameter("NombrePersona", entidad.getNombrePersona());
            insertbackup.setParameter("ApellidoPersona", entidad.getApellidoPersona());
            insertbackup.setParameter("CelularPersona", entidad.getCelularPersona());
            insertbackup.setParameter("TipoDocumento", entidad.getTipoDocumento());
            insertbackup.setParameter("DocumentoUsuario", entidad.getDocumentoUsuario());
            insertbackup.setParameter("IdDepto", entidad.getIdDepto());
            insertbackup.setParameter("IdCiudad", entidad.getIdCiudad());
            insertbackup.setParameter("Direccion", entidad.getDireccion());
            insertbackup.setParameter("Comentario", entidad.getComentario());
            insertbackup.setParameter("complementoDireccion", entidad.getComplementoDireccion());
            insertbackup.setParameter("IdManychat", entidad.getIdManychat());
            insertbackup.setParameter("DescripUno", entidad.getDescripUno());
            insertbackup.setParameter("DescripDos", entidad.getDescripDos());
            insertbackup.setParameter("DescripTres", entidad.getDescripTres());
            insertbackup.setParameter("Observacion", entidad.getObservacion());
            insertbackup.setParameter("Imagen", entidad.getImagen());

            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
