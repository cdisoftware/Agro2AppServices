package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CNuevasOfertasVdosEntity;
import com.cdi.com.Agroapoya2CDI.Services.CNuevasOfertasVdoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CNuevasOfertasVdoServiceImplementacion implements CNuevasOfertasVdoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CNuevasOfertasVdosEntity> ConsultaCNuevasOfertasVdo(Integer Bandera, Integer Usucodig, Integer Cd_cnctvo, Integer Id_Sector) {
        try {
            StoredProcedureQuery newOfert = repositorio.createNamedStoredProcedureQuery("paC_NuevasOfertas_Vdos");
            newOfert.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            newOfert.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            newOfert.registerStoredProcedureParameter("Cd_cnctvo", Integer.class, ParameterMode.IN);
            newOfert.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);

            newOfert.setParameter("Bandera", Bandera);
            newOfert.setParameter("Usucodig", Usucodig);
            newOfert.setParameter("Cd_cnctvo", Cd_cnctvo);
            newOfert.setParameter("Id_Sector", Id_Sector);

            return newOfert.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
