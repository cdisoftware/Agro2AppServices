package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CAgro_GruposUltimaMillaEntity;
import com.cdi.com.Agroapoya2CDI.Services.CAgGruposUltimaMillaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CAgGruposUltimaMillaServiceImplementacion implements CAgGruposUltimaMillaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CAgro_GruposUltimaMillaEntity> ConsultaGrupoUltMilla(Integer Bandera,
            Integer idGrupo, Integer cd_cnsctivo, Integer IdSector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_Agro_GruposUltimaMilla");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("idGrupo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("cd_cnsctivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("idGrupo", idGrupo);
            tpoDoc.setParameter("cd_cnsctivo", cd_cnsctivo);
            tpoDoc.setParameter("IdSector", IdSector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_Agro_GruposUltimaMilla)"
                    + " - Parametros: " + Bandera + "/" + idGrupo + "/" + cd_cnsctivo + "/" + IdSector
                    + " - ERROR JAVA = " + ex
            ));
            return list;
        }
    }

}
