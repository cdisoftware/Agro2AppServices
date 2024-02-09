package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adModificacionLinkCortoEntity;
import com.cdi.com.Agroapoya2CDI.Services.adModificacionLinkCortoService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adModificacionLinkCortoServiceImplementacion implements adModificacionLinkCortoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModLinkCorto(adModificacionLinkCortoEntity entidad, Integer BANDERA) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("admin_ModificacionLinkCorto");
            parametros.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("cd_cnsctvo", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Cod_descuento", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("id_carro", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("idGrupo", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("UrlLarga", String.class, ParameterMode.IN);

            parametros.setParameter("BANDERA", BANDERA);
            parametros.setParameter("cd_cnsctvo", entidad.getCd_cnsctvo());
            parametros.setParameter("IdSector", entidad.getIdSector());
            parametros.setParameter("Cod_descuento", entidad.getCod_descuento());
            parametros.setParameter("id_carro", entidad.getId_carro());
            parametros.setParameter("idGrupo", entidad.getIdGrupo());
            parametros.setParameter("UrlLarga", entidad.getUrlLarga());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_ModificacionLinkCorto)"
                    + " - Parametros: " + BANDERA + "/" + entidad.getCd_cnsctvo() + "/" + entidad.getIdSector()
                    + "/" + entidad.getCod_descuento() + "/" + entidad.getId_carro() + "/" + entidad.getIdGrupo() + "/" + entidad.getUrlLarga()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
