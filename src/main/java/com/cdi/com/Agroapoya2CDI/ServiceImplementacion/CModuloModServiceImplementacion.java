package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CModuloModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CModuloModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CModuloModServiceImplementacion implements CModuloModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCModulo(CModuloModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modmodulo = repositorio.createNamedStoredProcedureQuery("paC_ModuloMod");
            modmodulo.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modmodulo.registerStoredProcedureParameter("IdModulo", Integer.class, ParameterMode.IN);
            modmodulo.registerStoredProcedureParameter("NomModulo", String.class, ParameterMode.IN);

            modmodulo.setParameter("Bandera", Bandera);
            modmodulo.setParameter("IdModulo", entidad.getIdModulo());
            modmodulo.setParameter("NomModulo", entidad.getNomModulo());

            modmodulo.execute();
            return JSONObject.quote((String) modmodulo.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_ModuloMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdModulo() + "/" + entidad.getNomModulo()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
