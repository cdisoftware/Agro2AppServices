package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCarroComprasModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCarroComprasModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCarroComprasModServiceImplementacion implements CCarroComprasModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modCCarroCompras(CCarroComprasModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modCarro = repositorio.createNamedStoredProcedureQuery("paC_CarroComprasMod");
            modCarro.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modCarro.registerStoredProcedureParameter("Cd_cnsctivo", Integer.class, ParameterMode.IN);
            modCarro.registerStoredProcedureParameter("Unidades", Integer.class, ParameterMode.IN);
            modCarro.registerStoredProcedureParameter("Observaciones", String.class, ParameterMode.IN);
            modCarro.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            modCarro.registerStoredProcedureParameter("CodGrupo", String.class, ParameterMode.IN);
            modCarro.registerStoredProcedureParameter("TipoUsuarioCompra", Integer.class, ParameterMode.IN);
            modCarro.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            modCarro.registerStoredProcedureParameter("IdCarro", Integer.class, ParameterMode.IN);
            modCarro.registerStoredProcedureParameter("Toppings", String.class, ParameterMode.IN);
            modCarro.registerStoredProcedureParameter("LinkPartici", String.class, ParameterMode.IN);

            modCarro.setParameter("Bandera", Bandera);
            modCarro.setParameter("Cd_cnsctivo", entidad.getCd_cnsctivo());
            modCarro.setParameter("Unidades", entidad.getUnidades());
            modCarro.setParameter("Observaciones", entidad.getObservaciones());
            modCarro.setParameter("Usucodig", entidad.getUsucodig());
            modCarro.setParameter("CodGrupo", entidad.getCodGrupo());
            modCarro.setParameter("TipoUsuarioCompra", entidad.getTipoUsuarioCompra());
            modCarro.setParameter("IdSector", entidad.getIdSector());
            modCarro.setParameter("IdCarro", entidad.getIdCarro());
            modCarro.setParameter("Toppings", entidad.getToppings());
            modCarro.setParameter("LinkPartici", entidad.getLinkPartici());

            modCarro.execute();
            return JSONObject.quote((String) modCarro.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
