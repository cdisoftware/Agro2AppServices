package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CtipoUsuarioEntity;
import com.cdi.com.Agroapoya2CDI.Services.CtipoUsuarioService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CtipoUsuarioServiceImplementacion implements CtipoUsuarioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CtipoUsuarioEntity> ConsultaCTipoUsuario(Integer Bandera) {
        try {
            StoredProcedureQuery tipuser = repositorio.createNamedStoredProcedureQuery("paC_tipoUsuario");
            tipuser.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tipuser.setParameter("Bandera", Bandera);
            return tipuser.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_tipoUsuario)"
                    + " - Parametros: " + Bandera
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
