package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.entregasConductorEntity;
import java.util.List;

public interface entregasConductorService {

    public List<entregasConductorEntity> ConsultaEntregasConductor(Integer bandera, Integer ID_CNDCTOR, Integer ID_ENTREGA);
}
