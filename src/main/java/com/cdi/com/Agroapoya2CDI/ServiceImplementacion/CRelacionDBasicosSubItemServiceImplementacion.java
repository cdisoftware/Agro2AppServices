package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CRelacionDBasicosSubItemEntity;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionDBasicosSubItemService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CRelacionDBasicosSubItemServiceImplementacion implements CRelacionDBasicosSubItemService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CRelacionDBasicosSubItemEntity> ConsultaCRelacionDBasicosSubItem(Integer Bandera, Integer IdDtoBasico, Integer IdDtoRelacion, Integer IdSubitem) {
        try {
            StoredProcedureQuery datoSub = repositorio.createNamedStoredProcedureQuery("paC_RelacionDBasicosSubItems");
            datoSub.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            datoSub.registerStoredProcedureParameter("IdDtoBasico", Integer.class, ParameterMode.IN);
            datoSub.registerStoredProcedureParameter("IdDtoRelacion", Integer.class, ParameterMode.IN);
            datoSub.registerStoredProcedureParameter("IdSubitem", Integer.class, ParameterMode.IN);
            datoSub.setParameter("Bandera", Bandera);
            datoSub.setParameter("IdDtoBasico", IdDtoBasico);
            datoSub.setParameter("IdDtoRelacion", IdDtoRelacion);
            datoSub.setParameter("IdSubitem", IdSubitem);
            return datoSub.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_RelacionDBasicosSubItems)"
                    + " - Parametros: " + Bandera + "/" + IdDtoBasico + "/" + IdDtoRelacion + "/" + IdSubitem
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
