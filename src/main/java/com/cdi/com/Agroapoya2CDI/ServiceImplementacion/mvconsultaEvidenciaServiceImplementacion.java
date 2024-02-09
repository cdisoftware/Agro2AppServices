package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.mvconsultaEvidenciaEntity;
import com.cdi.com.Agroapoya2CDI.Services.mvconsultaEvidenciaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class mvconsultaEvidenciaServiceImplementacion implements mvconsultaEvidenciaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<mvconsultaEvidenciaEntity> ConsultaEvidenciaMovile(Integer Bandera, Integer id_evidencia, Integer id_factura) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("movile_consultaEvidencia");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("id_evidencia", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("id_factura", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("id_evidencia", id_evidencia);
            tpoDoc.setParameter("id_factura", id_factura);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (movile_consultaEvidencia)"
                    + " - Parametros: " + Bandera + "/" + id_evidencia + "/" + id_factura
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
