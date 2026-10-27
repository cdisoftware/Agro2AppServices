/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.Ikon_Pedidos_itemEntity;
import com.cdi.com.Agroapoya2CDI.Services.Ikon_Pedidos_itemService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class Ikon_Pedidos_itemServiceImplementacion implements Ikon_Pedidos_itemService{

    @PersistenceContext
    private EntityManager repositorio;
    
    @Override
    public List<Ikon_Pedidos_itemEntity> ConsultaItemsPedidosIkon(Integer IdPedido) {
        try {
            StoredProcedureQuery param = repositorio.createNamedStoredProcedureQuery("Ikon_Pedidos_item");
            param.registerStoredProcedureParameter("IdPedido", Integer.class, ParameterMode.IN);
            
             param.setParameter("IdPedido", IdPedido);

            return param.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (Ikon_Pedidos_item)"
                    + " - Parametros: "  + IdPedido
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }
    
}
