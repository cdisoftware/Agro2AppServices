package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.mvConsultaEntregasEntity;
import java.util.List;

public interface mvConsultaEntregaService {

    public List<mvConsultaEntregasEntity> ConsultaEntregaMovil(Integer Bandera, Integer IdGrupo);
}
