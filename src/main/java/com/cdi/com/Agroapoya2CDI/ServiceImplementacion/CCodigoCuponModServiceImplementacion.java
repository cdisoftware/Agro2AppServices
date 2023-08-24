package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCodigoCuponModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCodigoCuponModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCodigoCuponModServiceImplementacion implements CCodigoCuponModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCodigoCupon(CCodigoCuponModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("paC_CodigoCuponMod");
            insertbackup.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdGrupoAux", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("codigo_Mostrar", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("descripcion", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdTipoCuponGeneral", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdTipoCuponCodigoAplicableGeneral", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("FechaInicio", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("FechaFin", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("DescuentoAplicable", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("ApartirValor", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("scriptAdicional", String.class, ParameterMode.IN);

            insertbackup.setParameter("Bandera", Bandera);
            insertbackup.setParameter("IdGrupoAux", entidad.getIdGrupoAux());
            insertbackup.setParameter("codigo_Mostrar", entidad.getCodigo_Mostrar());
            insertbackup.setParameter("descripcion", entidad.getDescripcion());
            insertbackup.setParameter("IdTipoCuponGeneral", entidad.getIdTipoCuponGeneral());
            insertbackup.setParameter("IdTipoCuponCodigoAplicableGeneral", entidad.getIdTipoCuponCodigoAplicableGeneral());
            insertbackup.setParameter("FechaInicio", entidad.getFechaInicio());
            insertbackup.setParameter("FechaFin", entidad.getFechaFin());
            insertbackup.setParameter("DescuentoAplicable", entidad.getDescuentoAplicable());
            insertbackup.setParameter("Estado", entidad.getEstado());
            insertbackup.setParameter("ApartirValor", entidad.getApartirValor());
            insertbackup.setParameter("scriptAdicional", entidad.getScriptAdicional());

            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
