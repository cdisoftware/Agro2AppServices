package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zConsultarPagosFiadoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.zembajadorConjuntosReporteEntity;
import com.cdi.com.Agroapoya2CDI.Services.zConsultarPagosFiadoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zConsultarPagosFiadoServiceImplementacion implements zConsultarPagosFiadoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zConsultarPagosFiadoEntity> consPagosFiado(String FechaInicio, String FechaFin, Integer CodigoUsuario, String Correo, String Telefono, Integer IDEstadoPago, Integer IdLocalidad) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_ConsultarPagosFiado");
            tpoDoc.registerStoredProcedureParameter("FechaInicio", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("FechaFin", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("CodigoUsuario", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Correo", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Telefono", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IDEstadoPago", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdLocalidad", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("FechaInicio", FechaInicio);
            tpoDoc.setParameter("FechaFin", FechaFin);
            tpoDoc.setParameter("CodigoUsuario", CodigoUsuario);
            tpoDoc.setParameter("Correo", Correo);
            tpoDoc.setParameter("Telefono", Telefono);
            tpoDoc.setParameter("IDEstadoPago", IDEstadoPago);
            tpoDoc.setParameter("IdLocalidad", IdLocalidad);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_ConsultarPagosFiado)"
                    + " - Parametros: " + FechaInicio + "/" + FechaFin + "/" + CodigoUsuario + "/" + Correo + "/" + Telefono + "/" + IDEstadoPago + "/" + IdLocalidad
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
