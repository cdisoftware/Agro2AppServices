package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CRelacionDBasicosSubItemsModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionDBasicosSubItemsModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CRelacionDBasicosSubItemsModServiceImplementacion implements CRelacionDBasicosSubItemsModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCRelacionDBasicosSubItems(CRelacionDBasicosSubItemsModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery moddatos = repositorio.createNamedStoredProcedureQuery("paC_RelacionDBasicosSubItemsMod");
            moddatos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            moddatos.registerStoredProcedureParameter("IdDtoBasico", Integer.class, ParameterMode.IN);
            moddatos.registerStoredProcedureParameter("IdDtoRelacion", Integer.class, ParameterMode.IN);
            moddatos.registerStoredProcedureParameter("IdSubitem", Integer.class, ParameterMode.IN);
            moddatos.registerStoredProcedureParameter("IdSubitemDos", Integer.class, ParameterMode.IN);

            moddatos.setParameter("Bandera", Bandera);
            moddatos.setParameter("IdDtoBasico", entidad.getIdDtoBasico());
            moddatos.setParameter("IdDtoRelacion", entidad.getIdDtoRelacion());
            moddatos.setParameter("IdSubitem", entidad.getIdSubitem());
            moddatos.setParameter("IdSubitemDos", entidad.getIdSubitemDos());

            moddatos.execute();
            return JSONObject.quote((String) moddatos.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_RelacionDBasicosSubItemsMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdDtoBasico() + "/" + entidad.getIdDtoRelacion() + "/"
                    + entidad.getIdSubitem() + "/" + entidad.getIdSubitemDos()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
