package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAnadirValoresModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAnadirValoresModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAnadirValoresModServiceImplementacion implements CAnadirValoresModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCAnadirValor(CAnadirValoresModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery valor = repositorio.createNamedStoredProcedureQuery("paC_AnadirValoresMod");
            valor.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            valor.registerStoredProcedureParameter("Cd_cnsctvo", Integer.class, ParameterMode.IN);
            valor.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            valor.registerStoredProcedureParameter("IdValor", Integer.class, ParameterMode.IN);
            valor.registerStoredProcedureParameter("ValorUnd", Integer.class, ParameterMode.IN);

            valor.setParameter("Bandera", Bandera);
            valor.setParameter("Cd_cnsctvo", entidad.getCd_cnsctvo());
            valor.setParameter("IdSector", entidad.getIdSector());
            valor.setParameter("IdValor", entidad.getIdValor());
            valor.setParameter("ValorUnd", entidad.getValorUnd());

            valor.execute();
            return JSONObject.quote((String) valor.getOutputParameterValue("Repuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
