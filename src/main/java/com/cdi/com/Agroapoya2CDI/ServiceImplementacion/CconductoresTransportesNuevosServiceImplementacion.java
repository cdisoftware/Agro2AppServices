package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CconductoresTransportesNuevosEntity;
import com.cdi.com.Agroapoya2CDI.Services.CconductoresTransportesNuevosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CconductoresTransportesNuevosServiceImplementacion implements CconductoresTransportesNuevosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CconductoresTransportesNuevosEntity> ConsultaConductoresTransportes(Integer Bandera, Integer usucodigTrans, Integer CD_CNSCTVO, Integer IdSector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_conductoresTransportesNuevos");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("usucodigTrans", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("usucodigTrans", usucodigTrans);
            tpoDoc.setParameter("CD_CNSCTVO", CD_CNSCTVO);
            tpoDoc.setParameter("IdSector", IdSector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_conductoresTransportesNuevos)"
                    + " - Parametros: " + Bandera + "/" + usucodigTrans + "/" + CD_CNSCTVO + "/" + IdSector
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
