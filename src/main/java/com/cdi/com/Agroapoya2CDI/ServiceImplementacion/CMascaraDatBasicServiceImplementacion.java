package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CMascaraDatBasicEntity;
import com.cdi.com.Agroapoya2CDI.Services.CMascaraDatBasicService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CMascaraDatBasicServiceImplementacion implements CMascaraDatBasicService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CMascaraDatBasicEntity> consultaCMascaraDatBasic(Integer Bandera, Integer IdDtoBasico) {
        try {
            StoredProcedureQuery datosMas = repositorio.createNamedStoredProcedureQuery("paC_MascaraDatosBasicos");
            datosMas.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            datosMas.registerStoredProcedureParameter("IdDtoBasico", Integer.class, ParameterMode.IN);

            datosMas.setParameter("Bandera", Bandera);
            datosMas.setParameter("IdDtoBasico", IdDtoBasico);

            return datosMas.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
             list.add(0, JSONObject.quote("ERROR LOG (paC_MascaraDatosBasicos)"
                    + " - Parametros: " + Bandera + "/" + IdDtoBasico
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
