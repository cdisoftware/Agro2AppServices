package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.clteConsTextoOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.clteConsTextoOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class clteConsTextoOfertaServiceImplementacion implements clteConsTextoOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<clteConsTextoOfertaEntity> ConsultaClienteTextOferta(Integer Bandera, Integer cd_cnsctivo, Integer idsector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("cliente_ConsultaTextoOferta");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnsctivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("idsector", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("cd_cnsctivo", cd_cnsctivo);
            tpoDoc.setParameter("idsector", idsector);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia: " + ex));
            return list;
        }
    }

}
