package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CDatosBasicosSubItemModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CDatosBasicosSubItemModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CDatosBasicosSubItemModServiceImplementacion implements CDatosBasicosSubItemModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCDatosBasicosSubItem(CDatosBasicosSubItemModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery moddatos = repositorio.createNamedStoredProcedureQuery("paC_DatosBasicosSubItemMod");
            moddatos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            moddatos.registerStoredProcedureParameter("IdDatoBasico", Integer.class, ParameterMode.IN);
            moddatos.registerStoredProcedureParameter("Id", Integer.class, ParameterMode.IN);
            moddatos.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            moddatos.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            moddatos.registerStoredProcedureParameter("Texto", String.class, ParameterMode.IN);

            moddatos.setParameter("Bandera", Bandera);
            moddatos.setParameter("IdDatoBasico", entidad.getIdDatoBasico());
            moddatos.setParameter("Id", entidad.getId());
            moddatos.setParameter("Estado", entidad.getEstado());
            moddatos.setParameter("Descripcion", entidad.getDescripcion());
            moddatos.setParameter("Texto", entidad.getTexto());

            moddatos.execute();
            return JSONObject.quote((String) moddatos.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
