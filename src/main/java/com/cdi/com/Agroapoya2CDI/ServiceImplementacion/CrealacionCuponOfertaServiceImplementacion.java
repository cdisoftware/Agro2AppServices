package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CrealacionCuponOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CrealacionCuponOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CrealacionCuponOfertaServiceImplementacion implements CrealacionCuponOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CrealacionCuponOfertaEntity> ConsultaRealacionCuponOferta(Integer Bandera, Integer cd_cnsctvo, Integer codigo_grupo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_realacionCuponOferta");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnsctvo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("codigo_grupo", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("cd_cnsctvo", cd_cnsctvo);
            tpoDoc.setParameter("codigo_grupo", codigo_grupo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_realacionCuponOferta)"
                    + " - Parametros: " + Bandera + "/" + cd_cnsctvo + "/" + codigo_grupo
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
