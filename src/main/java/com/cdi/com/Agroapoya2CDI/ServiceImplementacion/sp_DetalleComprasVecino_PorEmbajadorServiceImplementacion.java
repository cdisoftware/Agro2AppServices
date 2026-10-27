package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.sp_DetalleComprasVecino_PorEmbajadorEntity;
import com.cdi.com.Agroapoya2CDI.Services.sp_DetalleComprasVecino_PorEmbajadorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class sp_DetalleComprasVecino_PorEmbajadorServiceImplementacion implements sp_DetalleComprasVecino_PorEmbajadorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<sp_DetalleComprasVecino_PorEmbajadorEntity> ConsultaDetalleComprasVecino(Integer UsucodigEmbajador, Integer UsucodigVecino) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("sp_DetalleComprasVecino_PorEmbajador");
            tpoDoc.registerStoredProcedureParameter("UsucodigEmbajador", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("UsucodigVecino", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("UsucodigEmbajador", UsucodigEmbajador);
            tpoDoc.setParameter("UsucodigVecino", UsucodigVecino);

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
            list.add(0, JSONObject.quote("ERROR LOG (sp_DetalleComprasVecino_PorEmbajador)"
                    + " - Parametros: " + UsucodigEmbajador + "/" + UsucodigVecino
                    + " - ERROR JAVA = " + mensaje));
            return list;
        }
    }

}
