package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zTipoCoordenadasZonaConsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zTipoCoordenadasZonaConsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zTipoCoordenadasZonaConsServiceImplementacion implements zTipoCoordenadasZonaConsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zTipoCoordenadasZonaConsEntity> consTipoCoordenadasZona(Integer Bandera, Integer IdZona) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_TipoCoordenadas_ZonaCons");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdZona", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdZona", IdZona);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_TipoCoordenadas_ZonaCons)"
                    + " - Parametros: " + Bandera + "/" + IdZona
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
