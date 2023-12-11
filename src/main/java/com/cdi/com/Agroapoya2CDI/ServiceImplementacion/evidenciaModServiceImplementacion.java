package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.evidenciaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.evidenciaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class evidenciaModServiceImplementacion implements evidenciaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String EvidenciaMod(evidenciaModEntity entidad, Integer bandera, Integer id_conductor, Integer id_factura, Integer Entregado) {
        try {
            StoredProcedureQuery mod = repositorio.createNamedStoredProcedureQuery("paC_evidenciaMod");
            mod.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("id_conductor", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("id_factura", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("Entregado", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("imagen", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("Coordenadas", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("ObservacionesDos", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("ObservacionesPago", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("idTipoPago", Integer.class, ParameterMode.IN);

            mod.setParameter("bandera", bandera);
            mod.setParameter("id_conductor", id_conductor);
            mod.setParameter("id_factura", id_factura);
            mod.setParameter("Entregado", Entregado);
            mod.setParameter("imagen", entidad.getImagen());
            mod.setParameter("Observacion", entidad.getObservacion());
            mod.setParameter("Coordenadas", entidad.getCoordenadas());
            mod.setParameter("ObservacionesDos", entidad.getObservacionesDos());
            mod.setParameter("ObservacionesPago", entidad.getObservacionesPago());
            mod.setParameter("idTipoPago", entidad.getIdTipoPago());

            mod.execute();
            return JSONObject.quote((String) mod.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_evidenciaMod)"
                    + " - Parametros: " + bandera + "/" + id_conductor + "/" + id_factura + "/" + Entregado + "/" + entidad.getImagen() + "/"
                    + entidad.getObservacion() + "/" + entidad.getCoordenadas() + "/" + entidad.getObservacionesDos() + "/"
                    + entidad.getObservacionesPago() + "/" + entidad.getIdTipoPago()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
