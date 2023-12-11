package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.CALCULADORA_VALORPAGOService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CALCULADORA_VALORPAGOServiceImplementacion implements CALCULADORA_VALORPAGOService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaValorPago(Integer TIPOCOMPRA, Integer CD_CNSCTVO, Integer CD_UNDAD, Integer USUCODIG, Integer descarga, Integer Bandera) {
        try {
            StoredProcedureQuery valorpago = repositorio.createNamedStoredProcedureQuery("paC_CalculadoraPagos");
            valorpago.registerStoredProcedureParameter("TIPOCOMPRA", Integer.class, ParameterMode.IN);
            valorpago.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            valorpago.registerStoredProcedureParameter("CD_UNDAD", Integer.class, ParameterMode.IN);
            valorpago.registerStoredProcedureParameter("USUCODIG", Integer.class, ParameterMode.IN);
            valorpago.registerStoredProcedureParameter("descarga", Integer.class, ParameterMode.IN);
            valorpago.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            valorpago.setParameter("TIPOCOMPRA", TIPOCOMPRA);
            valorpago.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            valorpago.setParameter("CD_UNDAD", CD_UNDAD);
            valorpago.setParameter("USUCODIG", USUCODIG);
            valorpago.setParameter("descarga", descarga);
            valorpago.setParameter("Bandera", Bandera);
            valorpago.execute();
            return JSONObject.quote((String) valorpago.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_CalculadoraPagos)"
                    + " - Parametros: " + TIPOCOMPRA + "/" + CD_CNSCTVO + "/" + CD_UNDAD + "/" + USUCODIG + "/" + descarga + "/" + Bandera
                    + " - ERROR JAVA = " + ex
            );
        }
    }
}
