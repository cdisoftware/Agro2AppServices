package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CcarrroLinkGrupoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CcarrroLinkGrupoService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CcarrroLinkGrupoServiceImplementacion implements CcarrroLinkGrupoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCarroLinkgrp(CcarrroLinkGrupoEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery SqlService = repositorio.createNamedStoredProcedureQuery("paC_carrroLinkGrupo");
            SqlService.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("IdHexaGrupo", String.class, ParameterMode.IN);
            SqlService.registerStoredProcedureParameter("ID_CARRO", String.class, ParameterMode.IN);

            SqlService.setParameter("Bandera", Bandera);
            SqlService.setParameter("IdHexaGrupo", entidad.getIdHexaGrupo());
            SqlService.setParameter("ID_CARRO", entidad.getID_CARRO());

            SqlService.execute();
            return JSONObject.quote((String) SqlService.getOutputParameterValue("repuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_carrroLinkGrupo)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdHexaGrupo() + "/" + entidad.getID_CARRO()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
