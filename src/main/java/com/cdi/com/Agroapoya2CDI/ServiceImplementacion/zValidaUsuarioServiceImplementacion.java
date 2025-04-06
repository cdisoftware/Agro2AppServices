package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zValidaUsuarioEntity;
import com.cdi.com.Agroapoya2CDI.Services.zValidaUsuarioService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zValidaUsuarioServiceImplementacion implements zValidaUsuarioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zValidaUsuarioEntity> consValidaUsuario(Integer Bandera, Integer IdSector, String Provado, String Telefono, Integer Usucodig) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_ValidaUsuario");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Provado", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Telefono", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            
            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdSector", IdSector);
            tpoDoc.setParameter("Provado", Provado);
            tpoDoc.setParameter("Telefono", Telefono);
            tpoDoc.setParameter("Usucodig", Usucodig);
            
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_ValidaUsuario)"
                    + " - Parametros: " + Bandera + "/" + IdSector + "/" + Provado + "/" + Telefono + "/" + Usucodig
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
