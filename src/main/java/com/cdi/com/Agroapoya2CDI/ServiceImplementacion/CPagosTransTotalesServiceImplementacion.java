package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.CPagosTransTotalesService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPagosTransTotalesServiceImplementacion implements CPagosTransTotalesService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaCPagosTransTotales(Integer Bandera, Integer IdGrupo) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("paC_PagosTransTotales");
            respu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("Id_Grupo", Integer.class, ParameterMode.IN);

            respu.setParameter("Bandera", Bandera);
            respu.setParameter("Id_Grupo", IdGrupo);

            respu.execute();
            return JSONObject.quote((String) respu.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
             return JSONObject.quote("ERROR LOG (paC_PagosTransTotales)"
                        +" - Parametros: " + Bandera + "/" + IdGrupo
                        +" - ERROR JAVA = " + ex);
        }
    }
}
