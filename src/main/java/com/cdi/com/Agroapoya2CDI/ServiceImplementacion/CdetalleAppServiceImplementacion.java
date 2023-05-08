package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CdetalleAppEntity;
import com.cdi.com.Agroapoya2CDI.Services.CdetalleAppService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CdetalleAppServiceImplementacion implements CdetalleAppService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CdetalleAppEntity> ConsultaDetalleApp(Integer Bandera, Integer UsucodigTrans, Integer cd_cnsctivo, Integer Sector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_detalleApp");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("UsucodigTrans", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnsctivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Sector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("UsucodigTrans", UsucodigTrans);
            tpoDoc.setParameter("cd_cnsctivo", cd_cnsctivo);
            tpoDoc.setParameter("Sector", Sector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
