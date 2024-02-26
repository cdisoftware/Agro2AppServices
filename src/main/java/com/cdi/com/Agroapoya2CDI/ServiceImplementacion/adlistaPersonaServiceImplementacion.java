package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adlistaPersonaEntity;
import com.cdi.com.Agroapoya2CDI.Services.adlistaPersonaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adlistaPersonaServiceImplementacion implements adlistaPersonaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adlistaPersonaEntity> consultaadlistaPersona(adlistaPersonaEntity entidad, Integer Bandera, Integer Cd_tpo_usuario, Integer Usucodig,
            Integer TipoRegistro, Integer RegistroValidado) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_listaPersona");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_tpo_usuario", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("NombrePersona", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("TipoRegistro", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("RegistroValidado", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Cd_tpo_usuario", Cd_tpo_usuario);
            tpoDoc.setParameter("Usucodig", Usucodig);
            tpoDoc.setParameter("NombrePersona", entidad.getNombres_persona());
            tpoDoc.setParameter("TipoRegistro", TipoRegistro);
            tpoDoc.setParameter("RegistroValidado", RegistroValidado);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (admin_listaPersona)"
                    + " - Parametros: " + Bandera + "/" + Cd_tpo_usuario + "/" + Usucodig + "/" + entidad.getNombres_persona() + "/" + TipoRegistro + "/" + RegistroValidado
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
