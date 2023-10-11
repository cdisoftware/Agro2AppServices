package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CRelacionProdToppingEntity;
import java.util.List;

public interface CRelacionProdToppingService {

    public List<CRelacionProdToppingEntity> ConsultaRelacionProdTopping(Integer Bandera, Integer IdTopping, Integer IdSector);
}
