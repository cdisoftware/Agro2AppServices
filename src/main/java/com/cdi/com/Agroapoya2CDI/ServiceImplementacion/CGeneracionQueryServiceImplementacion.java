package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CGeneracionQueryEntity;
import com.cdi.com.Agroapoya2CDI.Services.CGeneracionQueryService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CGeneracionQueryServiceImplementacion implements CGeneracionQueryService{
    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsQuery(CGeneracionQueryEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery ActLink = repositorio.createNamedStoredProcedureQuery("pac_GeneracionQuery");
            ActLink.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            ActLink.registerStoredProcedureParameter("Idplantilla", Integer.class, ParameterMode.IN);
            ActLink.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            ActLink.registerStoredProcedureParameter("cd_cnctivo", Integer.class, ParameterMode.IN);

            ActLink.setParameter("Bandera", Bandera);
            ActLink.setParameter("Idplantilla", entidad.getIdplantilla());
            ActLink.setParameter("IdSector", entidad.getIdSector());
            ActLink.setParameter("cd_cnctivo", entidad.getCd_cnctivo());

            ActLink.execute();
            return JSONObject.quote((String) ActLink.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
    
    
}