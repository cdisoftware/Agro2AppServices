package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zOfertaActivaInfomarcionAdicionalmodEntity;
import com.cdi.com.Agroapoya2CDI.Services.zOfertaActivaInfomarcionAdicionalmodService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zOfertaActivaInfomarcionAdicionalmodServiceImplementacion implements zOfertaActivaInfomarcionAdicionalmodService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modOfertaActivaInfoAdicional(zOfertaActivaInfomarcionAdicionalmodEntity Entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_OfertaActivaInfomarcionAdicional_mod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoRegaloRegla", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoRegaloParti", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoRegaloLider", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("MaximoRegaloLider", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("RegistroRegaloLider", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdRegaloLider", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdRegaloParti", Integer.class, ParameterMode.IN);
//            parametros.registerStoredProcedureParameter("IdTipoCuponLider", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("MaximoValorCuponLider", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("NumRegistrosCuponLider", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("ValorCuponLider", Integer.class, ParameterMode.IN);
//            parametros.registerStoredProcedureParameter("IdTipoCuponParticipante", Integer.class, ParameterMode.IN);
//            parametros.registerStoredProcedureParameter("MaximoValorCuponParticipante", Integer.class, ParameterMode.IN);
//            parametros.registerStoredProcedureParameter("NumRegistrosCuponParticipante", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("ValorCuponParticipante", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdOferta", Entidad.getIdOferta());
            parametros.setParameter("TipoRegaloRegla", Entidad.getTipoRegaloRegla());
            parametros.setParameter("TipoRegaloParti", Entidad.getTipoRegaloParti());
            parametros.setParameter("TipoRegaloLider", Entidad.getTipoRegaloLider());
            parametros.setParameter("MaximoRegaloLider", Entidad.getMaximoRegaloLider());
            parametros.setParameter("RegistroRegaloLider", Entidad.getRegistroRegaloLider());
            parametros.setParameter("IdRegaloLider", Entidad.getIdRegaloLider());
            parametros.setParameter("IdRegaloParti", Entidad.getIdRegaloParti());
//            parametros.setParameter("IdTipoCuponLider", Entidad.getIdTipoCuponLider());
            parametros.setParameter("MaximoValorCuponLider", Entidad.getMaximoValorCuponLider());
            parametros.setParameter("NumRegistrosCuponLider", Entidad.getNumRegistrosCuponLider());
            parametros.setParameter("ValorCuponLider", Entidad.getValorCuponLider());
//            parametros.setParameter("IdTipoCuponParticipante", Entidad.getIdTipoCuponParticipante());
//            parametros.setParameter("MaximoValorCuponParticipante", Entidad.getMaximoValorCuponParticipante());
//            parametros.setParameter("NumRegistrosCuponParticipante", Entidad.getNumRegistrosCuponParticipante());
            parametros.setParameter("ValorCuponParticipante", Entidad.getValorCuponParticipante());
            
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_OfertaActivaInfomarcionAdicional_mod)"
                    + " - Parametros: " + Bandera + "/" + Entidad.getIdOferta() + "/" + Entidad.getTipoRegaloRegla() + "/" + Entidad.getTipoRegaloParti() + "/" + Entidad.getTipoRegaloLider() + "/"
                    + Entidad.getMaximoRegaloLider() + "/" + Entidad.getRegistroRegaloLider() + "/" + Entidad.getIdRegaloLider() + "/" + Entidad.getIdRegaloParti() + "/"
                    + /*Entidad.getIdTipoCuponLider() +*/ "/" + Entidad.getMaximoValorCuponLider() + "/" + Entidad.getNumRegistrosCuponLider() + "/" + Entidad.getValorCuponLider() + "/" +
                    /*Entidad.getIdTipoCuponParticipante() +*/ "/" + /*Entidad.getMaximoValorCuponParticipante() +*/ "/" + /*Entidad.getNumRegistrosCuponParticipante() +*/ "/" + Entidad.getValorCuponParticipante()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
