package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CpersonaTransportistaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CpersonaTransportistaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CpersonaTransportistaModServiceImplementacion implements CpersonaTransportistaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModPersonaTransportista(CpersonaTransportistaModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("paC_personaTransportistaMod");
            insertbackup.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("codUsuario", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("nombres", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("apellido", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("telefono", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("correo", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("tipo_identificacion", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("numero_identificacion", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("direccion", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("CMNTRIO", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("TOKEN", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("dpto", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("ciudad", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Complemento_direccion", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("COORDENADAS", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("TPO_TRANSPORTE", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("frma_pgo", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("tpo_cnta", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("nocuenta", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("id_bnco", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("id_tpoprsn", Integer.class, ParameterMode.IN);

            insertbackup.setParameter("bandera", bandera);
            insertbackup.setParameter("codUsuario", entidad.getCodUsuario());
            insertbackup.setParameter("nombres", entidad.getNombres());
            insertbackup.setParameter("apellido", entidad.getApellido());
            insertbackup.setParameter("telefono", entidad.getTelefono());
            insertbackup.setParameter("correo", entidad.getCorreo());
            insertbackup.setParameter("tipo_identificacion", entidad.getTipo_identificacion());
            insertbackup.setParameter("numero_identificacion", entidad.getNumero_identificacion());
            insertbackup.setParameter("direccion", entidad.getDireccion());
            insertbackup.setParameter("CMNTRIO", entidad.getCMNTRIO());
            insertbackup.setParameter("TOKEN", entidad.getTOKEN());
            insertbackup.setParameter("dpto", entidad.getDpto());
            insertbackup.setParameter("ciudad", entidad.getCiudad());
            insertbackup.setParameter("Complemento_direccion", entidad.getComplemento_direccion());
            insertbackup.setParameter("COORDENADAS", entidad.getCOORDENADAS());
            insertbackup.setParameter("TPO_TRANSPORTE", entidad.getTPO_TRANSPORTE());
            insertbackup.setParameter("frma_pgo", entidad.getFrma_pgo());
            insertbackup.setParameter("tpo_cnta", entidad.getTpo_cnta());
            insertbackup.setParameter("nocuenta", entidad.getNocuenta());
            insertbackup.setParameter("id_bnco", entidad.getId_bnco());
            insertbackup.setParameter("id_tpoprsn", entidad.getId_tpoprsn());
            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_personaTransportistaMod)"
                    + " - Parametros: " + bandera + "/" + entidad.getCodUsuario() + "/" + entidad.getNombres() + "/"
                    + entidad.getApellido() + "/" + entidad.getTelefono() + "/"
                    + entidad.getCorreo() + "/" + entidad.getTipo_identificacion() + "/"
                    + entidad.getNumero_identificacion() + "/" + entidad.getDireccion() + "/"
                    + entidad.getCMNTRIO() + "/" + entidad.getTOKEN() + "/"
                    + entidad.getDpto() + "/" + entidad.getCiudad() + "/"
                    + entidad.getComplemento_direccion() + "/" + entidad.getCOORDENADAS() + "/"
                    + entidad.getTPO_TRANSPORTE() + "/" + entidad.getFrma_pgo() + "/"
                    + entidad.getTpo_cnta() + "/" + entidad.getNocuenta() + "/"
                    + entidad.getId_bnco() + "/" + entidad.getId_tpoprsn()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
