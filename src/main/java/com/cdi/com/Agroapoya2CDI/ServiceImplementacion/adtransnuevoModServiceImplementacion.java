package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adtransnuevoModEntity;
import com.cdi.com.Agroapoya2CDI.Services.adtransnuevoModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adtransnuevoModServiceImplementacion implements adtransnuevoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModTransporteNew(adtransnuevoModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("admin_transnuevoMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("UbicacionRecoge", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("ValorFlete", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("FechaRecoge", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdConductor", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdBodegaEntrega", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdTransporte", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("UbicacionRecoge", entidad.getUbicacionRecoge());
            parametros.setParameter("ValorFlete", entidad.getValorFlete());
            parametros.setParameter("FechaRecoge", entidad.getFechaRecoge());
            parametros.setParameter("IdConductor", entidad.getIdConductor());
            parametros.setParameter("IdBodegaEntrega", entidad.getIdBodegaEntrega());
            parametros.setParameter("IdTransporte", entidad.getIdTransporte());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (admin_transnuevoMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getUbicacionRecoge()
                    + "/" + entidad.getValorFlete() + "/" + entidad.getFechaRecoge() + "/" + entidad.getIdConductor() + "/" + entidad.getIdBodegaEntrega() + "/" + entidad.getIdTransporte()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
