package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.zProductosActivosOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Services.zProductosActivosOfertaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class zProductosActivosOfertaServiceImplementacion implements zProductosActivosOfertaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<zProductosActivosOfertaEntity> consProductosActivosOferta(Integer Bandera, Integer IdOferta, Integer TipoVentaProducto) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("z_ProductosActivosOferta");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IdOferta", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("TipoVentaProducto", Integer.class, ParameterMode.IN);
            
            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("IdOferta", IdOferta);
            tpoDoc.setParameter("TipoVentaProducto", TipoVentaProducto);
            
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (z_ProductosActivosOferta)"
                    + " - Parametros: " + Bandera + "/" + IdOferta + "/" + TipoVentaProducto
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
}
