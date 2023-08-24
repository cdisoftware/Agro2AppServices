package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CRelacionCuponOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionCuponOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CRelacionCuponOfertaModServiceImplementacion implements CRelacionCuponOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModRelaCuponOferta(CRelacionCuponOfertaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("paC_RelacionCuponOfertaMod");
            insertbackup.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("cd_cnsctivo", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Id_cuponCodigo", Integer.class, ParameterMode.IN);

            insertbackup.setParameter("Bandera", Bandera);
            insertbackup.setParameter("cd_cnsctivo", entidad.getCd_cnsctivo());
            insertbackup.setParameter("Id_cuponCodigo", entidad.getId_cuponCodigo());

            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
