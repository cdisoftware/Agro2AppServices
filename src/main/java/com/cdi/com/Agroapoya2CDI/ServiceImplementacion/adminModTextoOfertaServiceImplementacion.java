package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adminModTextoOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.adminModTextoOfertaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adminModTextoOfertaServiceImplementacion implements adminModTextoOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModificacionAdminTextoOferta(adminModTextoOfertaEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("admin_ModificacionTextoOferta");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("cd_cnsctivo", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("idsector", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("ModalRegistroTextoUno", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("ModalRegistroTextoDos", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("ModalRegistroTextoTres", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("ModalRegistroImagenUno", String.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("cd_cnsctivo", entidad.getCd_cnsctivo());
            modRespuesta.setParameter("idsector", entidad.getIdsector());
            modRespuesta.setParameter("ModalRegistroTextoUno", entidad.getModalRegistroTextoUno());
            modRespuesta.setParameter("ModalRegistroTextoDos", entidad.getModalRegistroTextoDos());
            modRespuesta.setParameter("ModalRegistroTextoTres", entidad.getModalRegistroTextoTres());
            modRespuesta.setParameter("ModalRegistroImagenUno", entidad.getModalRegistroImagenUno());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_ModificacionTextoOferta)"
                    + " - Parametros: " + Bandera + "/" + entidad.getCd_cnsctivo() + "/" + entidad.getIdsector() + "/"
                    + entidad.getModalRegistroTextoUno() + "/" + entidad.getModalRegistroTextoDos() + "/"
                    + entidad.getModalRegistroTextoTres() + "/" + entidad.getModalRegistroImagenUno()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
