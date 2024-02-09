package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.TDatosBasicosEntity;
import com.cdi.com.Agroapoya2CDI.Services.TDatosBasicosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class TDatosBasicosServiceImplementacion implements TDatosBasicosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<TDatosBasicosEntity> ConsultaTDatosBasic(Integer Bandera, Integer IdModulo) {
        try {
            StoredProcedureQuery datos = repositorio.createNamedStoredProcedureQuery("paT_DatosBasicos");
            datos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            datos.registerStoredProcedureParameter("IdModulo", Integer.class, ParameterMode.IN);

            datos.setParameter("Bandera", Bandera);
            datos.setParameter("IdModulo", IdModulo);

            return datos.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paT_DatosBasicos)"
                    + " - Parametros: " + Bandera + "/" + IdModulo
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
