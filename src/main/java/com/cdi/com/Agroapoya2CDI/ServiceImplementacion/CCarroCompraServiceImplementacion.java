package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCarroComprasEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCarroCompraService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCarroCompraServiceImplementacion implements CCarroCompraService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CCarroComprasEntity> ConsultaCCarroCompra(Integer Bandera, Integer Usucodig, Integer ID_CARRO) {
        try {
            StoredProcedureQuery cesta = repositorio.createNamedStoredProcedureQuery("paC_CarroCompras");
            cesta.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            cesta.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            cesta.registerStoredProcedureParameter("ID_CARRO", Integer.class, ParameterMode.IN);
            cesta.setParameter("Bandera", Bandera);
            cesta.setParameter("Usucodig", Usucodig);
            cesta.setParameter("ID_CARRO", ID_CARRO);
            return cesta.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
             list.add(0, JSONObject.quote("ERROR LOG (paC_CarroCompras)"
                    + " - Parametros: " + Bandera + "/" + Usucodig+ "/" + ID_CARRO
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
