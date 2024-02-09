package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CRelacionDatosBasicosEntity;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionDatosBasicoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CRelacionDatosBasicoServiceImplementacion implements CRelacionDatosBasicoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CRelacionDatosBasicosEntity> ConsultaCRelacionDatosBasicos(Integer Bandera, Integer IdDtoBasico) {
        try {
            StoredProcedureQuery datos = repositorio.createNamedStoredProcedureQuery("paC_RelacionDatosBasicos");
            datos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            datos.registerStoredProcedureParameter("IdDtoBasico", Integer.class, ParameterMode.IN);
            datos.setParameter("Bandera", Bandera);
            datos.setParameter("IdDtoBasico", IdDtoBasico);
            return datos.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_RelacionDatosBasicos)"
                    + " - Parametros: " + Bandera + "/" + IdDtoBasico
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
