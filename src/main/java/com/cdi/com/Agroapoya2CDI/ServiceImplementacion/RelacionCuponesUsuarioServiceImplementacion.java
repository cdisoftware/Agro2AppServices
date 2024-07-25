package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.RelacionCuponesUsuarioEntity;
import com.cdi.com.Agroapoya2CDI.Services.RelacionCuponesUsuarioService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class RelacionCuponesUsuarioServiceImplementacion implements RelacionCuponesUsuarioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<RelacionCuponesUsuarioEntity> ConsultaRelaCuponesUser(Integer Bandera, Integer Usucodig) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_RelacionCuponesUsuario");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Usucodig", Usucodig);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_RelacionCuponesUsuario)"
                    + " - Parametros: " + Bandera + "/" + Usucodig
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
