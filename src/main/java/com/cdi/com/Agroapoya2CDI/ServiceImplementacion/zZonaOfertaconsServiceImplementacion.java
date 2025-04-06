package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zZonaOfertaconsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zZonaOfertaconsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zZonaOfertaconsServiceImplementacion implements zZonaOfertaconsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zZonaOfertaconsEntity> consZonaOferta(Integer Bandera, String Localidad, Integer IdZona, Integer IdEstado) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_ZonaOferta_cons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Localidad", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdZona", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdEstado", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Localidad", Localidad);
            tpoDoc.setParameter("IdZona", IdZona);
            tpoDoc.setParameter("IdEstado", IdEstado);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_ZonaOferta_cons)"
                    + " - Parametros: " + Bandera + "/" + Localidad + "/" + IdZona + "/" + IdEstado
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
