package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.COfertasExternasEntity;
import com.cdi.com.Agroapoya2CDI.Services.COfertasExternasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class COfertasExternasServiceImplementacion implements COfertasExternasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<COfertasExternasEntity> ConsultaCOfertasExt(Integer Bandera, Integer Cd_cnctvo, Integer Id_Sector, Integer IdUsuario, String NombreProducto) {
        try {
            StoredProcedureQuery ofertExternas = repositorio.createNamedStoredProcedureQuery("paC_OfertasExternas");
            ofertExternas.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            ofertExternas.registerStoredProcedureParameter("Cd_cnctvo", Integer.class, ParameterMode.IN);
            ofertExternas.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);
            ofertExternas.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            ofertExternas.registerStoredProcedureParameter("NombreProducto", String.class, ParameterMode.IN);

            ofertExternas.setParameter("Bandera", Bandera);
            ofertExternas.setParameter("Cd_cnctvo", Cd_cnctvo);
            ofertExternas.setParameter("Id_Sector", Id_Sector);
            ofertExternas.setParameter("IdUsuario", IdUsuario);
            ofertExternas.setParameter("NombreProducto", NombreProducto);

            return ofertExternas.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_OfertasExternas)"
                    + " - Parametros: " + Bandera + "/" + Cd_cnctvo + "/" + Id_Sector + "/" + IdUsuario + "/" + NombreProducto
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
