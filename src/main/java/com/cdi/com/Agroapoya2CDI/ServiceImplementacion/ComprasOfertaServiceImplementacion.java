package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ComprasOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.ComprasOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ComprasOfertaServiceImplementacion implements ComprasOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ComprasOfertaEntity> ConsultaComprasOferta(Integer bandera, Integer Cd_csctivoNuvaOferta,
            Integer IdSectorNuevaOferta, Integer IdOfertaRegalo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paCComprasOferta");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_csctivoNuvaOferta", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSectorNuevaOferta", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdOfertaRegalo", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("Cd_csctivoNuvaOferta", Cd_csctivoNuvaOferta);
            tpoDoc.setParameter("IdSectorNuevaOferta", IdSectorNuevaOferta);
            tpoDoc.setParameter("IdOfertaRegalo", IdOfertaRegalo);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paCComprasOferta)"
                    + " - Parametros: " + bandera + "/" + Cd_csctivoNuvaOferta + "/" + IdSectorNuevaOferta + "/" + IdOfertaRegalo
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
