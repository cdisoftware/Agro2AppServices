package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.Ikon_ofertasEntity;
import com.cdi.com.Agroapoya2CDI.Services.Ikon_ofertasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class Ikon_ofertasServiceImplementacion implements Ikon_ofertasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<Ikon_ofertasEntity> ConsultaOfertasIkon() {
        try {
            StoredProcedureQuery param = repositorio.createNamedStoredProcedureQuery("Ikon_ofertas");

            return param.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (Ikon_ofertas)"
                    + " - Parametros: " 
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
