package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.menuEntity;
import com.cdi.com.Agroapoya2CDI.Services.menuService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class menuServiceImplementacion implements menuService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<menuEntity> ConsultaMenu(Integer Bandera, Integer IdTipoUsuario, Integer Usucodig) {
        try {
            StoredProcedureQuery menu = repositorio.createNamedStoredProcedureQuery("paT_menu");
            menu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            menu.registerStoredProcedureParameter("IdTipoUsuario", Integer.class, ParameterMode.IN);
            menu.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);

            menu.setParameter("Bandera", Bandera);
            menu.setParameter("IdTipoUsuario", IdTipoUsuario);
            menu.setParameter("Usucodig", Usucodig);

            return menu.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paT_menu)"
                    + " - Parametros: " + Bandera + "/" + IdTipoUsuario + "/" + Usucodig
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
