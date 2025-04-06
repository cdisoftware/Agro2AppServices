package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zOfertaActivaZonasConsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zOfertaActivaZonasConsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zOfertaActivaZonasConsImplementacion implements zOfertaActivaZonasConsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zOfertaActivaZonasConsEntity> consultaZOfertaActivaZonas(int Bandera, int IdOfertaActiva) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_OfertaActivaZonas_Cons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdOfertaActiva", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdOfertaActiva", IdOfertaActiva);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_OfertaActivaZonas_Cons)"
                    + " - Parametros: " + Bandera + "/" + IdOfertaActiva
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
