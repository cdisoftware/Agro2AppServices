package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.Ikon_EmbajadoresEntity;
import com.cdi.com.Agroapoya2CDI.Services.Ikon_EmbajadoresService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class Ikon_EmbajadoresServiceImplementacion implements Ikon_EmbajadoresService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<Ikon_EmbajadoresEntity> ConsultaEmbajadorIkon() {
        try {
            StoredProcedureQuery param = repositorio.createNamedStoredProcedureQuery("Ikon_Embajadores");

            return param.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (Ikon_Embajadores)"
                    + " - Parametros: "
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
