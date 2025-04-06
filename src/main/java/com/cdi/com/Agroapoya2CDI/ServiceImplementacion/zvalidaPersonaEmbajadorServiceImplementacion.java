package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zvalidaPersonaEmbajadorEntity;
import com.cdi.com.Agroapoya2CDI.Services.zvalidaPersonaEmbajadorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zvalidaPersonaEmbajadorServiceImplementacion implements zvalidaPersonaEmbajadorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zvalidaPersonaEmbajadorEntity> conszvalidaPersonaEmbajador(Integer Bandera, String TokenUsuario) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_validaPersonaEmbajador");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("TokenUsuario", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("TokenUsuario", TokenUsuario);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_validaPersonaEmbajador)"
                    + " - Parametros: " + Bandera + "/" + TokenUsuario
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
