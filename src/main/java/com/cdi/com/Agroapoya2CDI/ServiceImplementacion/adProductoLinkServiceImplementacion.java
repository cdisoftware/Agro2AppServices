package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adProductoLinksEntity;
import com.cdi.com.Agroapoya2CDI.Services.adProductoLinkService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adProductoLinkServiceImplementacion implements adProductoLinkService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adProductoLinksEntity> ConsultaProductoLinks(Integer Bandera, Integer TipoLink, Integer cd_prdcto) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_ProductoLinks");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("TipoLink", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_prdcto", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("TipoLink", TipoLink);
            tpoDoc.setParameter("cd_prdcto", cd_prdcto);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (admin_ProductoLinks)"
                    + " - Parametros: " + Bandera + "/" + TipoLink + "/" + cd_prdcto
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
