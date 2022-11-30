package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CPublicidadEntity;
import com.cdi.com.Agroapoya2CDI.Services.CPublicidadService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPublicidadServiceImplementacion implements CPublicidadService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CPublicidadEntity> ConsultaCPublicidad(Integer Bandera, Integer Id, Integer IdVista, Integer Usucodig) {
        try {
            StoredProcedureQuery publicidad = repositorio.createNamedStoredProcedureQuery("paC_Publicidad");
            publicidad.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            publicidad.registerStoredProcedureParameter("Id", Integer.class, ParameterMode.IN);
            publicidad.registerStoredProcedureParameter("IdVista", Integer.class, ParameterMode.IN);
            publicidad.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);

            publicidad.setParameter("Bandera", Bandera);
            publicidad.setParameter("Id", Id);
            publicidad.setParameter("IdVista", IdVista);
            publicidad.setParameter("Usucodig", Usucodig);

            return publicidad.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
