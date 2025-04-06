package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zembajadorConjuntosReporteEntity;
import com.cdi.com.Agroapoya2CDI.Services.zembajadorConjuntosReporteService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zembajadorConjuntosReporteServiceImplementacion implements zembajadorConjuntosReporteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zembajadorConjuntosReporteEntity> consEmbajadorConjuntosReporte(Integer Bandera, String Fechainicio, String Fechafin, Integer UsucodigEmbajador, String CorreoEmbajador, String TelefonoEmbajador, Integer UsucodigVecino, String CorreoVecino, String TelefonoVecino) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_embajadorConjuntosReporte");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Fechainicio", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Fechafin", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("UsucodigEmbajador", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CorreoEmbajador", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("TelefonoEmbajador", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("UsucodigVecino", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CorreoVecino", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("TelefonoVecino", String.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("Fechainicio", Fechainicio);
            tpoDoc.setParameter("Fechafin", Fechafin);
            tpoDoc.setParameter("UsucodigEmbajador", UsucodigEmbajador);
            tpoDoc.setParameter("CorreoEmbajador", CorreoEmbajador);
            tpoDoc.setParameter("TelefonoEmbajador", TelefonoEmbajador);
            tpoDoc.setParameter("UsucodigVecino", UsucodigVecino);
            tpoDoc.setParameter("CorreoVecino", CorreoVecino);
            tpoDoc.setParameter("TelefonoVecino", TelefonoVecino);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_embajadorConjuntosReporte)"
                    + " - Parametros: " + Bandera + "/" + Fechainicio + "/" + Fechafin + "/" + UsucodigEmbajador + "/" + CorreoEmbajador + "/" + TelefonoEmbajador + "/" + UsucodigVecino + "/" + CorreoVecino + "/" + TelefonoVecino
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
