package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.agroDescuentoConsultaEntity;
import com.cdi.com.Agroapoya2CDI.Services.agroDescuentoConsultaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;

@Service
public class agroDescuentoConsultaServiceImplementacion implements agroDescuentoConsultaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<agroDescuentoConsultaEntity> CosnultaAgroDescuento(Integer Bandera, Integer Cd_cnsctvo, Integer Id_sector) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("agro_DescuentoConsulta");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_cnsctvo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Id_sector", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Cd_cnsctvo", Cd_cnsctvo);
            tpoDoc.setParameter("Id_sector", Id_sector);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (agro_DescuentoConsulta)"
                    + " - Parametros: " + Bandera + "/" + Cd_cnsctvo + "/" + Id_sector
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
