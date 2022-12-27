package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CDatBasicSubItemEntity;
import com.cdi.com.Agroapoya2CDI.Services.CDatBasicSubItemService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CDatBasicSubItemServiceImplementacion implements CDatBasicSubItemService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CDatBasicSubItemEntity> ConsultaCDatBasicSubItem(CDatBasicSubItemEntity entidad, Integer Bandera, Integer IdDatoBasico) {
        try {
            StoredProcedureQuery datos = repositorio.createNamedStoredProcedureQuery("paC_DatosBasicosSubItem");
            datos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            datos.registerStoredProcedureParameter("IdDatoBasico", Integer.class, ParameterMode.IN);
            datos.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);

            datos.setParameter("Bandera", Bandera);
            datos.setParameter("IdDatoBasico", IdDatoBasico);
            datos.setParameter("Descripcion", entidad.getDSCRIPCION());

            return datos.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
