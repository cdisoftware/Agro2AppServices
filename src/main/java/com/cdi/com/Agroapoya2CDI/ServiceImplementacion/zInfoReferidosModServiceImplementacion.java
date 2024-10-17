package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zInfoReferidosModEntity;
import com.cdi.com.Agroapoya2CDI.Services.zInfoReferidosModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zInfoReferidosModServiceImplementacion implements zInfoReferidosModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modInfoReferidos(zInfoReferidosModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_InfoReferidosMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdOfertaActivaInformacion", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoRegaloParti", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("TipoRegaloLider", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdOfertaActivaInformacion", entidad.getIdOfertaActivaInformacion());
            parametros.setParameter("TipoRegaloParti", entidad.getTipoRegaloParti());
            parametros.setParameter("TipoRegaloLider", entidad.getTipoRegaloLider());
            
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
            
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_InfoReferidosMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdOfertaActivaInformacion() + "/" + entidad.getTipoRegaloParti()+ "/" + entidad.getTipoRegaloLider()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
