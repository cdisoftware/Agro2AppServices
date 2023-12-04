package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CinciaTransMillaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CinciaTransMillaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CinciaTransMillaServiceImplementacion implements CinciaTransMillaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String IniciaViajeMilla(CinciaTransMillaEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("paC_inciaTransMilla");
            insertbackup.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("idGrupo", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);

            insertbackup.setParameter("Bandera", Bandera);
            insertbackup.setParameter("idGrupo", entidad.getIdGrupo());
            insertbackup.setParameter("Estado", entidad.getEstado());

            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia {paC_inciaTransMilla} "+ ex);
        }

    }

}
