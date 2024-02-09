package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CarroComprasElectModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CarroComprasElectModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CarroComprasElectModServiceImplementacion implements CarroComprasElectModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCarroComprasElectronico(CarroComprasElectModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modRespuesta = repositorio.createNamedStoredProcedureQuery("paC_CarroComprasElectronicosMod");
            modRespuesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Cd_cnsctivo", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Unidades", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Observaciones", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("CodGrupo", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("TipoUsuarioCompra", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("IdCarro", Integer.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("Toppings", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("LinkPartici", String.class, ParameterMode.IN);
            modRespuesta.registerStoredProcedureParameter("CodDescuento", String.class, ParameterMode.IN);

            modRespuesta.setParameter("Bandera", Bandera);
            modRespuesta.setParameter("Cd_cnsctivo", entidad.getCd_cnsctivo());
            modRespuesta.setParameter("Unidades", entidad.getUnidades());
            modRespuesta.setParameter("Observaciones", entidad.getObservaciones());
            modRespuesta.setParameter("Usucodig", entidad.getUsucodig());
            modRespuesta.setParameter("CodGrupo", entidad.getCodGrupo());
            modRespuesta.setParameter("TipoUsuarioCompra", entidad.getTipoUsuarioCompra());
            modRespuesta.setParameter("IdSector", entidad.getIdSector());
            modRespuesta.setParameter("IdCarro", entidad.getIdCarro());
            modRespuesta.setParameter("Toppings", entidad.getToppings());
            modRespuesta.setParameter("LinkPartici", entidad.getLinkPartici());
            modRespuesta.setParameter("CodDescuento", entidad.getCodDescuento());

            modRespuesta.execute();
            return JSONObject.quote((String) modRespuesta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_CarroComprasElectronicosMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getCd_cnsctivo() + "/" + entidad.getUnidades() + "/"
                    + entidad.getObservaciones() + "/" + entidad.getUsucodig() + "/"
                    + entidad.getCodGrupo() + "/" + entidad.getTipoUsuarioCompra() + "/"
                    + entidad.getIdSector() + "/" + entidad.getIdCarro() + "/"
                    + entidad.getToppings() + "/" + entidad.getLinkPartici() + "/"
                    + entidad.getCodDescuento()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
