/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.Ikon_AuditoriaManychatDetalleEntity;
import com.cdi.com.Agroapoya2CDI.Services.Ikon_AuditoriaManychatDetalleService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class Ikon_AuditoriaManychatDetalleServiceImplementacion implements Ikon_AuditoriaManychatDetalleService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<Ikon_AuditoriaManychatDetalleEntity> ConsultaAuditoriaManyChat(Integer IdAuditoria) {
        try {
            StoredProcedureQuery param = repositorio.createNamedStoredProcedureQuery("Ikon_AuditoriaManychatDetalle");
            param.registerStoredProcedureParameter("IdAuditoria", Integer.class, ParameterMode.IN);

            param.setParameter("IdAuditoria", IdAuditoria);

            return param.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("ERROR LOG (Ikon_AuditoriaManychatDetalle)"
                    + " - Parametros: " + IdAuditoria
                    + " - ERROR JAVA = " + ex));
            return list;
        }
    }

}
