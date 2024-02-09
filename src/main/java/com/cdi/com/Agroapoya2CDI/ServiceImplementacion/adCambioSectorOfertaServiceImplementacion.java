package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adCambioSectorOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.adCambioSectorOfertaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adCambioSectorOfertaServiceImplementacion implements adCambioSectorOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCambioSectorOferta(adCambioSectorOfertaEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("admin_cambioSectorOferta");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("cd_cnstvo", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Id_sectorNuevo", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Id_sectorViejo", Integer.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("cd_cnstvo", entidad.getCd_cnstvo());
            modRespuesta.setParameter("Id_sectorNuevo", entidad.getId_sectorNuevo());
            modRespuesta.setParameter("Id_sectorViejo", entidad.getId_sectorViejo());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_cambioSectorOferta)"
                    + " - Parametros: " + Bandera + "/" + entidad.getCd_cnstvo() + "/" + entidad.getId_sectorNuevo() + "/" + entidad.getId_sectorViejo()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
