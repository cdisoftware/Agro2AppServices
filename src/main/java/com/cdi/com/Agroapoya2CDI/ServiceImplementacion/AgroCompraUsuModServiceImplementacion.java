package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.AgroCompraUsuModEntity;
import com.cdi.com.Agroapoya2CDI.Services.AgroCompraUsuModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class AgroCompraUsuModServiceImplementacion implements AgroCompraUsuModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAgroComprasUsu(AgroCompraUsuModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modAgro = repositorio.createNamedStoredProcedureQuery("Agro_compraUsuMod");
            modAgro.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modAgro.registerStoredProcedureParameter("IdsCarro", String.class, ParameterMode.IN);
            modAgro.registerStoredProcedureParameter("valorTotal", String.class, ParameterMode.IN);
            modAgro.registerStoredProcedureParameter("MedioPago", Integer.class, ParameterMode.IN);
            modAgro.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            modAgro.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);

            modAgro.setParameter("Bandera", Bandera);
            modAgro.setParameter("IdsCarro", entidad.getIdsCarro());
            modAgro.setParameter("valorTotal", entidad.getValorTotal());
            modAgro.setParameter("MedioPago", entidad.getMedioPago());
            modAgro.setParameter("Usucodig", entidad.getUsucodig());
            modAgro.setParameter("Observacion", entidad.getObservacion());

            modAgro.execute();
            return JSONObject.quote((String) modAgro.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (Agro_compraUsuMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdsCarro() + "/" + entidad.getValorTotal() + "/" + entidad.getMedioPago() + "/" + entidad.getUsucodig()
                    + "/" + entidad.getObservacion()
                    + " - ERROR JAVA = " + ex);
        }

    }

}
