package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adConsultaImagenesUsuariosEntity;
import com.cdi.com.Agroapoya2CDI.Services.adConsultaImagenesUsuarioService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adConsultaImagenesUsuarioServiceImplementacion implements adConsultaImagenesUsuarioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adConsultaImagenesUsuariosEntity> ConsultaImagenesUsers(Integer Bandera, Integer Usucodig) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_ConsultaImagenesUsuarios");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Usucodig", Usucodig);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia: " + ex));
            return list;
        }
    }

}
