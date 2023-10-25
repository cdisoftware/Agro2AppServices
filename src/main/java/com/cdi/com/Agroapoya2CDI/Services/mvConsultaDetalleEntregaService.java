package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.mvConsultaDetalleEntregasEntity;
import java.util.List;

public interface mvConsultaDetalleEntregaService {

    public List<mvConsultaDetalleEntregasEntity> consultaMovilDetallEntrega(Integer Bandera, Integer IdCarro);
}
