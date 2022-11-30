package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CSeguimientoGeneralEntity;
import java.util.List;

public interface CSeguimientoGeneralService {

    public List<CSeguimientoGeneralEntity> ConsultaCSeguimientoGen(Integer Bandera, Integer IdCliente);
}
