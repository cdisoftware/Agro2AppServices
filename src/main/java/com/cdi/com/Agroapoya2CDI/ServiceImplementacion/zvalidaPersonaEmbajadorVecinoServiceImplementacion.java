package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zvalidaPersonaEmbajadorVecinoEntity;
import com.cdi.com.Agroapoya2CDI.Services.zvalidaPersonaEmbajadorVecinoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zvalidaPersonaEmbajadorVecinoServiceImplementacion implements zvalidaPersonaEmbajadorVecinoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zvalidaPersonaEmbajadorVecinoEntity> consValidaPersonaEmbajador(Integer Bandera, String CorreoPersona, Integer UsucodigEmbajador) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_validaPersonaEmbajadorVecino");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CorreoPersona", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("UsucodigEmbajador", Integer.class, ParameterMode.IN);
            
            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("CorreoPersona", CorreoPersona);
            tpoDoc.setParameter("UsucodigEmbajador", UsucodigEmbajador);
            
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_validaPersonaEmbajadorVecino)"
                    + " - Parametros: " + Bandera + "/" + Bandera + "/" + CorreoPersona + "/" + UsucodigEmbajador
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
