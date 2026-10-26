package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.sp_SolicitarPagoComision_PorVecinoEntity;
import com.cdi.com.Agroapoya2CDI.Services.sp_SolicitarPagoComision_PorVecinoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class sp_SolicitarPagoComision_PorVecinoServiceImplementacion implements sp_SolicitarPagoComision_PorVecinoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<sp_SolicitarPagoComision_PorVecinoEntity> SolicitarPagoComisionPorVecino(sp_SolicitarPagoComision_PorVecinoEntity entidad) {
        try {
            if (entidad == null || entidad.getUsucodigEmbajador() == null || entidad.getUsucodigVecino() == null
                    || entidad.getTipoDePago() == null || entidad.getLlaveDePago() == null) {
                List list = new ArrayList();
                list.add(0, JSONObject.quote("ERROR: Todos los parámetros (UsucodigEmbajador, UsucodigVecino, TipoDePago, LlaveDePago) son obligatorios."));
                return list;
            }

            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("sp_SolicitarPagoComision_PorVecino");
            tpoDoc.registerStoredProcedureParameter("UsucodigEmbajador", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("UsucodigVecino", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("TipoDePago", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("LlaveDePago", String.class, ParameterMode.IN);

            tpoDoc.setParameter("UsucodigEmbajador", entidad.getUsucodigEmbajador());
            tpoDoc.setParameter("UsucodigVecino", entidad.getUsucodigVecino());
            tpoDoc.setParameter("TipoDePago", entidad.getTipoDePago());
            tpoDoc.setParameter("LlaveDePago", entidad.getLlaveDePago());

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            String mensaje = ex.getMessage();
            Throwable root = ex;
            while (root.getCause() != null && root.getCause() != root) {
                root = root.getCause();
                if (root.getMessage() != null && !root.getMessage().isEmpty()) {
                    mensaje = root.getMessage();
                }
            }
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (sp_SolicitarPagoComision_PorVecino)"
                    + " - Parametros: " + (entidad != null ? (entidad.getUsucodigEmbajador() + "/" + entidad.getUsucodigVecino() + "/" + entidad.getTipoDePago() + "/" + entidad.getLlaveDePago()) : "null")
                    + " - ERROR JAVA = " + mensaje));
            return list;
        }
    }

}
