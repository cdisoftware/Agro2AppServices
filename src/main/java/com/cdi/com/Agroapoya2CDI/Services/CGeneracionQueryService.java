package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CGeneracionQueryEntity;
import java.util.List;

public interface CGeneracionQueryService {
    public List<CGeneracionQueryEntity> ConsQuery(Integer Bandera, Integer IdPlantilla, Integer IdSector, Integer cd_cnctivo, String Respuesta);
}
