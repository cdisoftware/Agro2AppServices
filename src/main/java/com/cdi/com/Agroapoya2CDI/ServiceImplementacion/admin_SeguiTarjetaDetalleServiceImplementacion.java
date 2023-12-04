package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.admin_SeguiTarjetaDetalleEntity;
import com.cdi.com.Agroapoya2CDI.Services.admin_SeguiTarjetaDetalleService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class admin_SeguiTarjetaDetalleServiceImplementacion implements admin_SeguiTarjetaDetalleService{
    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<admin_SeguiTarjetaDetalleEntity> Cons(Integer Bandera, Integer IdGrupo) {
        try {
            StoredProcedureQuery Cons = repositorio.createNamedStoredProcedureQuery("admin_SeguiTarjetaDetalle");
            Cons.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            Cons.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);

            Cons.setParameter("Bandera", Bandera);
            Cons.setParameter("IdGrupo", IdGrupo);

            return Cons.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia {admin_SeguiTarjetaDetalle} " + ex));
            return list;
        }
    }
}