package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zRelacionLocalidadZonaConsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zRelacionLocalidadZonaConsServices;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zRelacionLocalidadZonaConsServicesImplementacion implements zRelacionLocalidadZonaConsServices {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zRelacionLocalidadZonaConsEntity> conszRelacionLocalidadCons(Integer Bandera, Integer Localidad) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_RelacionLocalidadZona_Cons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Localidad", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Localidad", Localidad);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_RelacionLocalidadZona_Cons)"
                    + " - Parametros: " + Bandera + "/" + Localidad
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
