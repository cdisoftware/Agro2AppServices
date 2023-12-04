package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.movile_TransActivosEntity;
import com.cdi.com.Agroapoya2CDI.Services.movile_TransActivosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class movile_TransActivosServiceImplementacion implements movile_TransActivosService{
    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<movile_TransActivosEntity> CosultaGeneralEntregaMovile(Integer bandera, Integer IdConductor, Integer UsuCodTrans) {
        try {
            StoredProcedureQuery Cos = repositorio.createNamedStoredProcedureQuery("movile_TransActivos");
            Cos.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            Cos.registerStoredProcedureParameter("id_condutor", Integer.class, ParameterMode.IN);
            Cos.registerStoredProcedureParameter("usucodigTrans", Integer.class, ParameterMode.IN);

            Cos.setParameter("bandera", bandera);
            Cos.setParameter("id_condutor", IdConductor);
            Cos.setParameter("usucodigTrans", UsuCodTrans);

            return Cos.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("movile_TransActivos" + ex));
            return list;
        }
    }
}