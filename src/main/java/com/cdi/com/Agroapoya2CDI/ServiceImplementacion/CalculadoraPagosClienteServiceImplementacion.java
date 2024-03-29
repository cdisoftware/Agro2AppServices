package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CalculadoraPagosClienteEntity;
import com.cdi.com.Agroapoya2CDI.Services.CalculadoraPagosClienteService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraPagosClienteServiceImplementacion implements CalculadoraPagosClienteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CalculadoraPagosClienteEntity> ConsultaCalculadoraPagosClient(CalculadoraPagosClienteEntity entidad, Integer Bandera, Integer Operacion,
            Integer Formato, Integer Cd_Cnsctvo, Integer Id_Sector, Integer Unidades, Integer Usucodig, String CodGrupo, String CodigoDescuento) {
        try {
            StoredProcedureQuery calcul = repositorio.createNamedStoredProcedureQuery("paC_CalculadoraPagosCliente");
            calcul.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            calcul.registerStoredProcedureParameter("Operacion", Integer.class, ParameterMode.IN);
            calcul.registerStoredProcedureParameter("Formato", Integer.class, ParameterMode.IN);
            calcul.registerStoredProcedureParameter("Cd_Cnsctvo", Integer.class, ParameterMode.IN);
            calcul.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);
            calcul.registerStoredProcedureParameter("Unidades", Integer.class, ParameterMode.IN);
            calcul.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            calcul.registerStoredProcedureParameter("CodGrupo", String.class, ParameterMode.IN);
            calcul.registerStoredProcedureParameter("Topping", String.class, ParameterMode.IN);
            calcul.registerStoredProcedureParameter("CodigoDescuento", String.class, ParameterMode.IN);

            calcul.setParameter("Bandera", Bandera);
            calcul.setParameter("Operacion", Operacion);
            calcul.setParameter("Formato", Formato);
            calcul.setParameter("Cd_Cnsctvo", Cd_Cnsctvo);
            calcul.setParameter("Id_Sector", Id_Sector);
            calcul.setParameter("Unidades", Unidades);
            calcul.setParameter("CodGrupo", CodGrupo);
            calcul.setParameter("Usucodig", Usucodig);
            calcul.setParameter("Topping", entidad.getRtaValor());
            calcul.setParameter("CodigoDescuento", CodigoDescuento);

            return calcul.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_CalculadoraPagosCliente)"
                    + " - Parametros: " + Bandera + "/" + Operacion + "/" + Formato + "/" + Cd_Cnsctvo + "/"
                    + Id_Sector + "/" + Unidades + "/" + CodGrupo + "/"
                    + Usucodig + "/" + entidad.getRtaValor() + "/" + CodigoDescuento
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
