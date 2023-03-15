package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CusuariosCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Services.CusuariosCorreoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CusuariosCorreoServiceImplementacion implements CusuariosCorreoService{
    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CusuariosCorreoEntity> ConsCooreos(Integer Bandera, Integer TipoPersona, String Correopersona, String NombrePersona) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("pac_usuariosCorreo");
            respu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("TipoPersona", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("Correopersona", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("NombrePersona", String.class, ParameterMode.IN);
            
            respu.setParameter("Bandera", Bandera);
            respu.setParameter("TipoPersona", TipoPersona);
            respu.setParameter("Correopersona", Correopersona);
            respu.setParameter("NombrePersona", NombrePersona);
            return respu.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
