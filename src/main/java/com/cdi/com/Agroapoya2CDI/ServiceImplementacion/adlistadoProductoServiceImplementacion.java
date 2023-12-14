package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adlistadoProductoEntity;
import com.cdi.com.Agroapoya2CDI.Services.adlistadoProductoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adlistadoProductoServiceImplementacion implements adlistadoProductoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adlistadoProductoEntity> ConsultaAdListaProductos(Integer Bandera, Integer Cd_cnsctvo, Integer IdSector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_listadoProducto");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_cnsctvo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Cd_cnsctvo", Cd_cnsctvo);
            tpoDoc.setParameter("IdSector", IdSector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (admin_listadoProducto)"
                    + " - Parametros: " + Bandera + "/" + Cd_cnsctvo + "/" + IdSector
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
