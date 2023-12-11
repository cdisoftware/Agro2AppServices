package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CBodegaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CBodegaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CBodegaModServiceImplementacion implements CBodegaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModBodega(CBodegaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("paC_BodegaMod");
            insertbackup.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdBodega", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdDepto", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdCiudad", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("NombreBodega", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Coordenadas", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            insertbackup.setParameter("Bandera", Bandera);
            insertbackup.setParameter("IdBodega", entidad.getIdBodega());
            insertbackup.setParameter("IdDepto", entidad.getIdDepto());
            insertbackup.setParameter("IdCiudad", entidad.getIdCiudad());
            insertbackup.setParameter("NombreBodega", entidad.getNombreBodega());
            insertbackup.setParameter("Descripcion", entidad.getDescripcion());
            insertbackup.setParameter("Direccion", entidad.getDireccion());
            insertbackup.setParameter("Coordenadas", entidad.getCoordenadas());
            insertbackup.setParameter("IdSector", entidad.getIdSector());

            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_BodegaMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdBodega() + "/" + entidad.getIdDepto() + "/" + entidad.getIdCiudad()
                    + "/" + entidad.getNombreBodega() + "/" + entidad.getDescripcion() + "/" + entidad.getDireccion() + "/" + entidad.getCoordenadas()
                    + "/" + entidad.getIdSector()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
