package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CZonasSectorEntity;
import java.util.List;

public interface CZonasSectorService {

    public List<CZonasSectorEntity> ConsultaCZonasSector(CZonasSectorEntity entidad, Integer Bandera, Integer id, Integer cd_mncpio, Integer cd_dpto);
}
