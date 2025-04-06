package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zfiadoUsuarioEntity;
import com.cdi.com.Agroapoya2CDI.Services.zfiadoUsuarioService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zfiadoUsuarioServiceImplementacion implements zfiadoUsuarioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zfiadoUsuarioEntity> consFiadoUsuario(Integer Bandera, Integer Usucodig) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_fiadoUsuario");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Usucodig", Usucodig);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_fiadoUsuario)"
                    + " - Parametros: " + Bandera + "/" + Usucodig
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
