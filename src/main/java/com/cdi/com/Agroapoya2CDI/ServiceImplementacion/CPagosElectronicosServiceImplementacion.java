package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CPagosElectronicosEntity;
import com.cdi.com.Agroapoya2CDI.Services.CPagosElectronicosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPagosElectronicosServiceImplementacion implements CPagosElectronicosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CPagosElectronicosEntity> ConsultaCPagosElectronicos(Integer Bandera, String Id_carro) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("pac_PagosElectronicos");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Id_carro", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Id_carro", Id_carro);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
             list.add(0, JSONObject.quote("ERROR LOG (pac_PagosElectronicos)"
                    + " - Parametros: " + Bandera + "/" + Id_carro
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
