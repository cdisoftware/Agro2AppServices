package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.COfertaEstadosEntity;
import com.cdi.com.Agroapoya2CDI.Services.COfertaEstadosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class COfertaEstadosServiceImplementacion implements COfertaEstadosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<COfertaEstadosEntity> consultaCOgertaEstados(Integer bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("pac_OfertaEstados");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("bandera", bandera);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (pac_OfertaEstados)"
                    + " - Parametros: " + bandera
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
