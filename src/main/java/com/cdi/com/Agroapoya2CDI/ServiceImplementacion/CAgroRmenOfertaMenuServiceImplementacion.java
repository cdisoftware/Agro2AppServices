package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroRmenOfertaMenuEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAgroRmenOfertaMenuService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAgroRmenOfertaMenuServiceImplementacion implements CAgroRmenOfertaMenuService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CAgroRmenOfertaMenuEntity> ConsultaResumenOfertaMenu(Integer bandera, String CD_CNSCTVO) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paCAgro_resumen_oferta_menu");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CD_CNSCTVO", String.class, ParameterMode.IN);

            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("CD_CNSCTVO", CD_CNSCTVO);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
