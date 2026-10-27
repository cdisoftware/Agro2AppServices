package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.Ikon_UsuariosEntity;
import com.cdi.com.Agroapoya2CDI.Services.Ikon_UsuariosServices;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class Ikon_UsuariosServiceImplementacion implements Ikon_UsuariosServices {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<Ikon_UsuariosEntity> ConsultaUsuariosIkon() {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("Ikon_Usuarios");

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (Ikon_Usuarios)"
                    + " - Parametros: " 
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
