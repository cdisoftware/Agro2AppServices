package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CinfoOfertaGrupoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CinfoOfertaGrupoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CinfoOfertaGrupoServiceImplementacion implements CinfoOfertaGrupoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CinfoOfertaGrupoEntity> consultaInfOfertaGp(Integer Bandera, String codigo_Mostrar) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_infoOfertaGrupo");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("codigo_Mostrar", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("codigo_Mostrar", codigo_Mostrar);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
