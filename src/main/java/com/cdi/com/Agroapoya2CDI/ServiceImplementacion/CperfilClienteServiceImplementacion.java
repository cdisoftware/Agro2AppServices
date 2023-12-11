package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CperfilClienteEntity;
import com.cdi.com.Agroapoya2CDI.Services.CperfilClienteService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CperfilClienteServiceImplementacion implements CperfilClienteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CperfilClienteEntity> CosnultaCPerfilClient(CperfilClienteEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery perfilClient = repositorio.createNamedStoredProcedureQuery("paC_perfilCliente");
            perfilClient.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            perfilClient.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            perfilClient.registerStoredProcedureParameter("correo", String.class, ParameterMode.IN);

            perfilClient.setParameter("bandera", bandera);
            perfilClient.setParameter("usucodig", entidad.getUsucodig());
            perfilClient.setParameter("correo", entidad.getCorreoPersona());

            return perfilClient.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_perfilCliente)"
                    + " - Parametros: " + bandera + "/" + entidad.getUsucodig() + "/" + entidad.getCorreoPersona()
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
