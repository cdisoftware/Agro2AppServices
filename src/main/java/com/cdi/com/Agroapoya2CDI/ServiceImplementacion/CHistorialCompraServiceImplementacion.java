package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CHistorialComprasEntity;
import com.cdi.com.Agroapoya2CDI.Services.CHistorialCompraService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CHistorialCompraServiceImplementacion implements CHistorialCompraService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CHistorialComprasEntity> ConsultaCHistorialCompra(Integer Bandera, Integer Usucodig, Integer ID_CARRO) {
        try {
            StoredProcedureQuery Historial = repositorio.createNamedStoredProcedureQuery("paC_HistorialCompras");
            Historial.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            Historial.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            Historial.registerStoredProcedureParameter("ID_CARRO", Integer.class, ParameterMode.IN);

            Historial.setParameter("Bandera", Bandera);
            Historial.setParameter("Usucodig", Usucodig);
            Historial.setParameter("ID_CARRO", ID_CARRO);

            return Historial.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
