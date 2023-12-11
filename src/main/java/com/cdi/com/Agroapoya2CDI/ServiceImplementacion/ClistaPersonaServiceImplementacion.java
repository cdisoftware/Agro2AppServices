package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ClistaPersonaEntity;
import com.cdi.com.Agroapoya2CDI.Services.ClistaPersonaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ClistaPersonaServiceImplementacion implements ClistaPersonaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ClistaPersonaEntity> ConsultaListaPersona(ClistaPersonaEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_listaPersona");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("TipoPersona", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CorreoPersona", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Telefono", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cedula", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("TipoPersona", entidad.getCD_TPO_PRSNA());
            tpoDoc.setParameter("CorreoPersona", entidad.getCORREO_PERSONA());
            tpoDoc.setParameter("Telefono", entidad.getCELULAR_PERSONA());
            tpoDoc.setParameter("Cedula", entidad.getDOCUMENTO_USUARIO());
            tpoDoc.setParameter("Nombre", entidad.getNOMBRES_PERSONA());

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_listaPersona)"
                    + " - Parametros: " + Bandera + "/" + entidad.getCD_TPO_PRSNA() + "/" + entidad.getCORREO_PERSONA() + "/"
                    + entidad.getCELULAR_PERSONA() + "/" + entidad.getDOCUMENTO_USUARIO() + "/"
                    + entidad.getNOMBRES_PERSONA()
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
