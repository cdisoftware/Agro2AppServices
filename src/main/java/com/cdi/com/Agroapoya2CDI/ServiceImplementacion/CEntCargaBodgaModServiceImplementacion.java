package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CEntCargaBodgaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CEntCargaBodgaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CEntCargaBodgaModServiceImplementacion implements CEntCargaBodgaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCEntregaCargaBodega(CEntCargaBodgaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("paC_EntregaCargaBodegaMod");
            insertbackup.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Cd_cnctivo", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);

            insertbackup.setParameter("Bandera", Bandera);
            insertbackup.setParameter("Estado", entidad.getEstado());
            insertbackup.setParameter("Cd_cnctivo", entidad.getCd_cnctivo());
            insertbackup.setParameter("Id_Sector", entidad.getId_Sector());
            insertbackup.setParameter("Observacion", entidad.getObservacion());

            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Repuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_EntregaCargaBodegaMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getEstado() + "/" + entidad.getCd_cnctivo() + "/" + entidad.getId_Sector() + "/" + entidad.getObservacion()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
