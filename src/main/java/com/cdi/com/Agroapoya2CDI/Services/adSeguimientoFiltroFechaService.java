package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adSeguimientoFiltroFechaEntity;
import java.util.List;

public interface adSeguimientoFiltroFechaService {

    public List<adSeguimientoFiltroFechaEntity> ConsultaSeguimientoFiltroFecha(adSeguimientoFiltroFechaEntity entidad, Integer Bandera, Integer IdGrupoMilla, Integer Cd_cnsctvo);
}
