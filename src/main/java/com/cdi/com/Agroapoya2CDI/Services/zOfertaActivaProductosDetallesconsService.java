package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.zOfertaActivaProductosDetallesconsEntity;
import java.util.List;

public interface zOfertaActivaProductosDetallesconsService {
    public List<zOfertaActivaProductosDetallesconsEntity> consOfertaActivaProductosDetalles(Integer Bandera, Integer IdProducto, Integer IdOferta);
}
