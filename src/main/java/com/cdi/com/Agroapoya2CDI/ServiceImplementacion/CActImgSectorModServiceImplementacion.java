package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CActImgSectorModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CActImgSectorModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CActImgSectorModServiceImplementacion implements CActImgSectorModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ActualizaImgSector(CActImgSectorModEntity entidad, Integer BANDERA) {
        try {
            StoredProcedureQuery Mod = repositorio.createNamedStoredProcedureQuery("paCActualizaImagenSectorMod");
            Mod.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            Mod.registerStoredProcedureParameter("ID_SECTOR", Integer.class, ParameterMode.IN);
            Mod.registerStoredProcedureParameter("NOMBRE_IMG", String.class, ParameterMode.IN);

            Mod.setParameter("BANDERA", BANDERA);
            Mod.setParameter("ID_SECTOR", entidad.getID_SECTOR());
            Mod.setParameter("NOMBRE_IMG", entidad.getNOMBRE_IMG());

            Mod.execute();
            return JSONObject.quote((String) Mod.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paCActualizaImagenSectorMod)"
                    + " - Parametros: " + BANDERA + "/" + entidad.getID_SECTOR() + "/" + entidad.getNOMBRE_IMG()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
