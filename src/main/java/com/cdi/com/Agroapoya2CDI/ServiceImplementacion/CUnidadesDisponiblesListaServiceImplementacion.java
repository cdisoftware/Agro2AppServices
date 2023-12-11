package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CUnidadesDisponiblesListaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CUnidadesDisponiblesListaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CUnidadesDisponiblesListaServiceImplementacion implements CUnidadesDisponiblesListaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CUnidadesDisponiblesListaEntity> ConsultaUnidadesDisponiblesList(Integer Bandera, Integer Usucodig, Integer Cd_csctvo, Integer Id_Sector, String codMostrar) {
        try {
            StoredProcedureQuery list = repositorio.createNamedStoredProcedureQuery("paC_UnidadesDisponiblesLista");
            list.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            list.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            list.registerStoredProcedureParameter("Cd_csctvo", Integer.class, ParameterMode.IN);
            list.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);
            list.registerStoredProcedureParameter("codMostrar", String.class, ParameterMode.IN);
            list.setParameter("Bandera", Bandera);
            list.setParameter("Usucodig", Usucodig);
            list.setParameter("Cd_csctvo", Cd_csctvo);
            list.setParameter("Id_Sector", Id_Sector);
            list.setParameter("codMostrar", codMostrar);
            return list.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_UnidadesDisponiblesLista)"
                    + " - Parametros: " + Bandera + "/" + Usucodig + "/" + Cd_csctvo + "/" + Id_Sector + "/" + codMostrar
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
