package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ZOfertaActivaInfoModEntity;
import com.cdi.com.Agroapoya2CDI.Services.ZOfertaActivaInfoModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ZOfertaActivaInfoModServiceImplementacion implements ZOfertaActivaInfoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modzOfertaActivaInfo(ZOfertaActivaInfoModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("Z_OfertaActivaInfoMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("FechaInicio", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("FechaFin", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("FechaEntrega", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoOfeta", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("MascaraLocali", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoDomicilio", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("ValorDomicilio", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("ValorInicialDomicilio", Integer.class, ParameterMode.IN);
            
            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdOferta", entidad.getIdOferta());
            parametros.setParameter("FechaInicio", entidad.getFechaInicio());
            parametros.setParameter("FechaFin", entidad.getFechaFin());
            parametros.setParameter("FechaEntrega", entidad.getFechaEntrega());
            parametros.setParameter("TipoOfeta", entidad.getTipoOfeta());
            parametros.setParameter("MascaraLocali", entidad.getMascaraLocali());
            parametros.setParameter("TipoDomicilio", entidad.getTipoDomicilio());
            parametros.setParameter("ValorDomicilio", entidad.getValorDomicilio());
            parametros.setParameter("ValorInicialDomicilio", entidad.getValorInicialDomicilio());
                        
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (Z_OfertaActivaInfoMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdOferta() + "/" + entidad.getFechaInicio() + "/" + entidad.getFechaFin() + "/" + entidad.getFechaEntrega()
                    + "/" + entidad.getTipoOfeta() + "/" + entidad.getMascaraLocali() + "/" + entidad.getTipoDomicilio() + "/" + entidad.getValorDomicilio() + "/" + entidad.getValorInicialDomicilio()
                    + " - ERROR JAVA = " + ex);
        }
    }

}
