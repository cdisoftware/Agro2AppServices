package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zImagenesAsociadasSectorOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.zImagenesAsociadasSectorOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zImagenesAsociadasSectorOfertaModServiceImplementacion implements zImagenesAsociadasSectorOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String modzImagenesAsociSectorOferta(zImagenesAsociadasSectorOfertaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery parametros = repositorio.createNamedStoredProcedureQuery("z_ImagenesAsociadasSectorOferta_Mod");
            parametros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdImagen", Integer.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            parametros.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);
            
            parametros.setParameter("Bandera", Bandera);
            parametros.setParameter("IdImagen", entidad.getIdImagen());
            parametros.setParameter("Nombre", entidad.getNombre());
            parametros.setParameter("IdOferta", entidad.getIdOferta());
            
            parametros.execute();
            return JSONObject.quote((String) parametros.getOutputParameterValue("Respuesta"));
            
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (z_ImagenesAsociadasSectorOferta_Mod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdImagen()+ "/" + entidad.getNombre()+ "/" + entidad.getIdOferta()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
