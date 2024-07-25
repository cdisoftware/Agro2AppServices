package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.agroDescuentoModEntity;
import com.cdi.com.Agroapoya2CDI.Services.agroDescuentoModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class agroDescuentoModServiceImplementacion implements agroDescuentoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAgroDescuento(agroDescuentoModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("agro_DescuentoMod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Cd_cnsctvo", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Id_sector", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("ValorDesde", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("PorceDescuento", Integer.class, ParameterMode.IN);

            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("Cd_cnsctvo", entidad.getCd_cnsctvo());
            parametros.setParameter("Id_sector", entidad.getId_sector());
            parametros.setParameter("ValorDesde", entidad.getValorDesde());
            parametros.setParameter("PorceDescuento", entidad.getPorceDescuento());

            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (agro_DescuentoMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getCd_cnsctvo() + "/"
                    + entidad.getId_sector() + "/" + entidad.getValorDesde() + "/" + entidad.getPorceDescuento()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
