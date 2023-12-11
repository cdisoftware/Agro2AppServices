package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoCosteoXOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTipoCosteoXOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTipoCosteoXOfertaServiceImplementacion implements CTipoCosteoXOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CTipoCosteoXOfertaEntity> ConsTipoCosteoferta(Integer bandera, Integer ID_OFERTA) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paCTipoCosteoXOferta");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("ID_OFERTA", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("ID_OFERTA", ID_OFERTA);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paCTipoCosteoXOferta)"
                    + " - Parametros: " + bandera + "/" + ID_OFERTA
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
