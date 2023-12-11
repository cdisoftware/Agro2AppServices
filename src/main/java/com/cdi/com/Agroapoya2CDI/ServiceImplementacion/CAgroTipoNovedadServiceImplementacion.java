package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroTipoNovedadEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAgroTipoNovedadService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAgroTipoNovedadServiceImplementacion implements CAgroTipoNovedadService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CAgroTipoNovedadEntity> ConsultaCAgroTipoNovedad(Integer Bandera, Integer IdNovedad) {
        try {
            StoredProcedureQuery tipoNov = repositorio.createNamedStoredProcedureQuery("paC_AgroTipoNovedad");
            tipoNov.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tipoNov.registerStoredProcedureParameter("IdNovedad", Integer.class, ParameterMode.IN);
            tipoNov.setParameter("Bandera", Bandera);
            tipoNov.setParameter("IdNovedad", IdNovedad);
            return tipoNov.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_AgroTipoNovedad)"
                    + " - Parametros: " + Bandera + "/" + IdNovedad
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
