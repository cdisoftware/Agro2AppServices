package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CSeguimientoEntrEntity;
import java.util.List;

public interface CSeguimientoEntrService {

    public List<CSeguimientoEntrEntity> ConsSeguimientoEntrega(Integer bandera, Integer id_grupo);
}
