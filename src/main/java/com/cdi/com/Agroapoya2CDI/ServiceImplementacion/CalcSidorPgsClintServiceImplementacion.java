package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CalcSidorPgsClintEntity;
import com.cdi.com.Agroapoya2CDI.Services.CalcSidorPgsClintService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CalcSidorPgsClintServiceImplementacion implements CalcSidorPgsClintService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CalcSidorPgsClintEntity> consCalSimuladorCliente(CalcSidorPgsClintEntity entidad, Integer Bandera, Integer Operacion, Integer Formato, Integer Cd_Cnsctvo,
            Integer Id_Sector, Integer Unidades, Integer Usucodig, String CodGrupo, Integer undParti) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_CalculadoraSimuladorPagosCliente");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Operacion", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Formato", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Cd_Cnsctvo", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Unidades", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CodGrupo", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Topping", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("undParti", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Operacion", Operacion);
            tpoDoc.setParameter("Formato", Formato);
            tpoDoc.setParameter("Cd_Cnsctvo", Cd_Cnsctvo);
            tpoDoc.setParameter("Id_Sector", Id_Sector);
            tpoDoc.setParameter("Unidades", Unidades);
            tpoDoc.setParameter("Usucodig", Usucodig);
            tpoDoc.setParameter("CodGrupo", CodGrupo);
            tpoDoc.setParameter("Topping", entidad.getRtaValor());
            tpoDoc.setParameter("undParti", undParti);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_CalculadoraSimuladorPagosCliente)"
                    + " - Parametros: " + Bandera + "/" + Operacion + "/" + Formato + "/" + Cd_Cnsctvo + "/"
                    + Id_Sector + "/" + Unidades + "/" + Usucodig + "/"
                    + CodGrupo + "/" + entidad.getRtaValor() + "/" + undParti
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
