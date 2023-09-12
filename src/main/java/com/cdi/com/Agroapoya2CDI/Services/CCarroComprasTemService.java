package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CCarroComprasTemEntity;
import java.util.List;

public interface CCarroComprasTemService {

    public List<CCarroComprasTemEntity> consultaCarroComprasTem(CCarroComprasTemEntity entidad, Integer Bandera, Integer Usucodig, String CodigoDescuento, String CodigoDescuentoGenera);
}
