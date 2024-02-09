package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.CValidaSectorUsuarioService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CValidaSectorUsuarioServiceImplementacion implements CValidaSectorUsuarioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaCValidaSectorUsuario(Integer Bandera, Integer IdUsuario) {
        try {
            StoredProcedureQuery sectorUsu = repositorio.createNamedStoredProcedureQuery("paC_validaSectorUsuario");
            sectorUsu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            sectorUsu.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            sectorUsu.setParameter("Bandera", Bandera);
            sectorUsu.setParameter("IdUsuario", IdUsuario);
            sectorUsu.execute();
            return JSONObject.quote((String) sectorUsu.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_validaSectorUsuario)"
                    + " - Parametros: " + Bandera + "/" + IdUsuario
                    + " - ERROR JAVA = " + ex);
        }
    }
}
