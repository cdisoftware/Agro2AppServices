package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CSeguimientoEntrEntity;
import java.util.List;

public interface CSeguimientoEntrService {

    public List<CSeguimientoEntrEntity> ConsSeguimientoEntrega(CSeguimientoEntrEntity entidad, Integer bandera, Integer ID_CNDCTOR, Integer id_Sector, Integer cd_cnctivo);
}
