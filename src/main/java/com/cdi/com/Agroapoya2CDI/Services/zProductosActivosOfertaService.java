package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.zProductosActivosOfertaEntity;
import java.util.List;

public interface zProductosActivosOfertaService {
    public List<zProductosActivosOfertaEntity> consProductosActivosOferta(Integer Bandera, Integer IdOferta, Integer TipoVentaProducto);
}
