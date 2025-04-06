package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zMapaCalorconsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zMapaCalorconsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zMapaCalorconsServiceImplementacion implements zMapaCalorconsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zMapaCalorconsEntity> consMapaCalor(Integer Bandera, String FechaIncioCompra, String FechaFinCompra, String FechaRegistro, Integer IdLocalidad, Integer NumCompras) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_MapaCalor_cons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("FechaIncioCompra", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("FechaFinCompra", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("FechaRegistro", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdLocalidad", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("NumCompras", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("FechaIncioCompra", FechaIncioCompra);
            tpoDoc.setParameter("FechaFinCompra", FechaFinCompra);
            tpoDoc.setParameter("FechaRegistro", FechaRegistro);
            tpoDoc.setParameter("IdLocalidad", IdLocalidad);
            tpoDoc.setParameter("NumCompras", NumCompras);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_MapaCalor_cons)"
                    + " - Parametros: " + Bandera + "/" + FechaIncioCompra + "/" + FechaFinCompra + "/" + FechaRegistro + "/" + IdLocalidad + "/" + NumCompras
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }
}
