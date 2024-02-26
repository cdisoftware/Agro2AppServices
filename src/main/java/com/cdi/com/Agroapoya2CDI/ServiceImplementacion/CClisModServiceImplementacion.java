package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CClisModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CClisModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CClisModServiceImplementacion implements CClisModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCClis(CClisModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("PaC_ClisMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Cedula", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Fecha", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Estado", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Empresa", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Nom_Archivo", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Celular", String.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("Cedula", entidad.getCedula());
            parametros.setParameter("Fecha", entidad.getFecha());
            parametros.setParameter("Estado", entidad.getEstado());
            parametros.setParameter("Empresa", entidad.getEmpresa());
            parametros.setParameter("Nom_Archivo", entidad.getNom_Archivo());
            parametros.setParameter("Nombre", entidad.getNombre());
            parametros.setParameter("Celular", entidad.getCelular());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (PaC_ClisMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getCedula() + "/" + entidad.getFecha() + "/" + entidad.getEstado() + "/" + entidad.getEmpresa()
                    + "/" + entidad.getNom_Archivo() + "/" + entidad.getNombre() + "/" + entidad.getCelular()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
