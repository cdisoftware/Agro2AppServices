package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.adreporteUsuarioServEntity;
import com.cdi.com.Agroapoya2CDI.Services.adreporteUsuarioServService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class adreporteUsuarioServServiceImplementacion implements adreporteUsuarioServService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<adreporteUsuarioServEntity> ConsultaReporteUsuarios(adreporteUsuarioServEntity entidad, Integer Bandera, Integer IdLocalidad) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("admin_reporteUsuarioServices");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("NombrePersona", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("NumeroTelefono", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Correo", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdLocalidad", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("FechaRegistro", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("NumeroCompras", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("NombrePersona", entidad.getNombrePersona());
            tpoDoc.setParameter("NumeroTelefono", entidad.getCelularPersona());
            tpoDoc.setParameter("Correo", entidad.getCorreoPersona());
            tpoDoc.setParameter("IdLocalidad", IdLocalidad);
            tpoDoc.setParameter("FechaRegistro", entidad.getFechaCreacion());
            tpoDoc.setParameter("NumeroCompras", entidad.getNumCompras());

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paA_Ofertas)"
                    + " - Parametros: " + Bandera + "/" + entidad.getNombrePersona() + "/" + entidad.getCelularPersona() + "/" + entidad.getCorreoPersona() + "/" + IdLocalidad
                    + "/" + entidad.getFechaCreacion() + "/" + entidad.getNumCompras()
                    + " - ERROR JAVA = " + ex));
            return list;

        }
    }

}
