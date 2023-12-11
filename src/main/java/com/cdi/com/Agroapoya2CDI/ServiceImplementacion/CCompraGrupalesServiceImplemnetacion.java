package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCompraGrupalesEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCompraGrupalesService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCompraGrupalesServiceImplemnetacion implements CCompraGrupalesService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CCompraGrupalesEntity> ConsCompraGrpal(Integer Bandera, Integer IdGrupo, Integer Cd_cnsctivo, Integer Id_Sector, Integer IdCarro) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_CompraGrupales");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_cnsctivo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdCarro", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdGrupo", IdGrupo);
            tpoDoc.setParameter("Cd_cnsctivo", Cd_cnsctivo);
            tpoDoc.setParameter("Id_Sector", Id_Sector);
            tpoDoc.setParameter("IdCarro", IdCarro);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_CompraGrupales)"
                    + " - Parametros: " + Bandera + "/" + IdGrupo + "/" + Cd_cnsctivo + "/" + Id_Sector + "/" + IdCarro
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
