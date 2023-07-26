package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.TBodegasEntity;
import java.util.List;

public interface TBodegaService {

    public List<TBodegasEntity> ConsultaTBodega(Integer Bandera, Integer IdDepa, Integer IdCiudad, Integer IdSector);
}
