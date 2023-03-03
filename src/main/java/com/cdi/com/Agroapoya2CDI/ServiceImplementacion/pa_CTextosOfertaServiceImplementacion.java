package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.pa_CTextosOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.pa_CTextosOfertaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class pa_CTextosOfertaServiceImplementacion implements pa_CTextosOfertaService{

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String TextOfer(pa_CTextosOfertaEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("pa_CTextosOferta");
            respu.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("idSector", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("cd_cnctivo", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("TextoCorreo", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("TextoWhat", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("ImgCorreo", String.class, ParameterMode.IN);
            
            respu.setParameter("Bandera", Bandera);
            respu.setParameter("idSector", entidad.getIdSector());
            respu.setParameter("cd_cnctivo", entidad.getCd_cnctivo());
            respu.setParameter("TextoCorreo", entidad.getTextoCorreo());
            respu.setParameter("TextoWhat", entidad.getTextoWhat());
            respu.setParameter("ImgCorreo", entidad.getImgCorreo());
            respu.execute();
            return JSONObject.quote((String) respu.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
