package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CReporteUsuariosEntity;
import com.cdi.com.Agroapoya2CDI.Services.CReporteUsuarioService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CReporteUsuarioServiceImplementacion implements CReporteUsuarioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CReporteUsuariosEntity> ConsultaCReporteUsuario(CReporteUsuariosEntity entidad, Integer Bandera, String FechaDesde, String FechaHasta) {
        try {
            StoredProcedureQuery RepotUser = repositorio.createNamedStoredProcedureQuery("paC_ReporteUsuarios");
            RepotUser.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            RepotUser.registerStoredProcedureParameter("IdTipoUsuario", Integer.class, ParameterMode.IN);
            RepotUser.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            RepotUser.registerStoredProcedureParameter("FechaDesde", String.class, ParameterMode.IN);
            RepotUser.registerStoredProcedureParameter("FechaHasta", String.class, ParameterMode.IN);
            RepotUser.registerStoredProcedureParameter("Correo", String.class, ParameterMode.IN);
            RepotUser.registerStoredProcedureParameter("NombrePers", String.class, ParameterMode.IN);

            RepotUser.setParameter("Bandera", Bandera);
            RepotUser.setParameter("IdTipoUsuario", entidad.getIdTipoPersona());
            RepotUser.setParameter("Usucodig", entidad.getUsucodig());
            RepotUser.setParameter("FechaDesde", FechaDesde);
            RepotUser.setParameter("FechaHasta", FechaHasta);
            RepotUser.setParameter("Correo", entidad.getCorreoPersona());
            RepotUser.setParameter("NombrePers", entidad.getNombrePersona());

            return RepotUser.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (paC_ReporteUsuarios)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdTipoPersona() + "/" + entidad.getUsucodig() + "/"
                    + FechaDesde + "/" + FechaHasta + "/" + entidad.getCorreoPersona() + "/"
                    + entidad.getNombrePersona()
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
