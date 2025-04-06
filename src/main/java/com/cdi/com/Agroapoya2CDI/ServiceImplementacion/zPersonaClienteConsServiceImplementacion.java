package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zPersonaClienteConsEntity;
import com.cdi.com.Agroapoya2CDI.Services.zPersonaClienteConsService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zPersonaClienteConsServiceImplementacion implements zPersonaClienteConsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zPersonaClienteConsEntity> consPersonaCliente(Integer IdUsuario, String Correo, Integer NumeroCompras, String Telefono, String NombreApellido, Integer Localidad) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_PersonaClienteCons");
            tpoDoc.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Correo", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("NumeroCompras", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Telefono", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("NombreApellido", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Localidad", Integer.class, ParameterMode.IN);
            
            tpoDoc.setParameter("IdUsuario", IdUsuario);
            tpoDoc.setParameter("Correo", Correo);
            tpoDoc.setParameter("NumeroCompras", NumeroCompras);
            tpoDoc.setParameter("Telefono", Telefono);
            tpoDoc.setParameter("NombreApellido", NombreApellido);
            tpoDoc.setParameter("Localidad", Localidad);
            
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_PersonaClienteCons)"
                    + " - Parametros: " + IdUsuario + "/" + Correo + "/" + NumeroCompras + "/" + Telefono + "/" + NombreApellido + "/" + Localidad
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
