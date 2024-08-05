package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CuponesRelacionDetallEntity;
import java.util.List;

public interface CuponesRelacionDetalleService {

    public List<CuponesRelacionDetallEntity> ConsultaCuponesRela(Integer Bandera, Integer IdCarroLider);
}
