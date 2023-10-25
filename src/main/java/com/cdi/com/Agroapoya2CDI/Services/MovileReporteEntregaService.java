package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.MovileReporteEntregasEntity;
import java.util.List;

public interface MovileReporteEntregaService {

    public List<MovileReporteEntregasEntity> ConsultaMovileReporteEntrega(Integer Bandera, Integer IdGrupo, Integer IdProducto);
}
