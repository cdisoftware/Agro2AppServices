package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zMovileFiadoModEntity;
import com.cdi.com.Agroapoya2CDI.Services.zMovileFiadoModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zMovileFiadoModServiceImplementacion implements zMovileFiadoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modMovileFiado(Integer IdCarro, zMovileFiadoModEntity Entidad) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_MovileFiadoMod");
            parametros.registerStoredProcedureParameter("IdCarro", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("ValorFiado", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("EstadoPago", Integer.class, ParameterMode.IN);

            parametros.setParameter("IdCarro", IdCarro);
            parametros.setParameter("Usucodig", Entidad.getUsucodig());
            parametros.setParameter("ValorFiado", Entidad.getValorFiado());
            parametros.setParameter("EstadoPago", Entidad.getEstadoPago());
            
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_MovileFiadoMod)"
                    + " - Parametros: " + IdCarro + "/" + Entidad.getUsucodig() + "/" + Entidad.getValorFiado() + "/" + Entidad.getEstadoPago()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
