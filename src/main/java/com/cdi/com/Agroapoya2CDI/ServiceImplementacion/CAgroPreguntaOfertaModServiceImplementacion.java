package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroPreguntaOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAgroPreguntaOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAgroPreguntaOfertaModServiceImplementacion implements CAgroPreguntaOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAgroPreguntOfert(CAgroPreguntaOfertaModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("paCAgro_Pregunta_Oferta_Mod");
            insertbackup.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("ID_PRGNTA_OFR", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("CD_CNSCTVO", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("ID_SCTOR_OFRTA", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("CD_TPO_PRGNTA", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("TTLO_PRGNTA", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("OPCIONES_PRGNTA", String.class, ParameterMode.IN);

            insertbackup.setParameter("bandera", bandera);
            insertbackup.setParameter("ID_PRGNTA_OFR", entidad.getID_PRGNTA_OFR());
            insertbackup.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            insertbackup.setParameter("ID_SCTOR_OFRTA", entidad.getID_SCTOR_OFRTA());
            insertbackup.setParameter("CD_TPO_PRGNTA", entidad.getCD_TPO_PRGNTA());
            insertbackup.setParameter("TTLO_PRGNTA", entidad.getTTLO_PRGNTA());
            insertbackup.setParameter("OPCIONES_PRGNTA", entidad.getOPCIONES_PRGNTA());

            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
