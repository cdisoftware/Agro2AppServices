package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.zcuponesDescuentoconsEntity;
import java.util.List;

public interface zcuponesDescuentoconsService {

    public List<zcuponesDescuentoconsEntity> consCuponesDescuento(Integer Bandera, Integer TipoCupon, Integer IdOferta, Integer IdRegalo);
}
