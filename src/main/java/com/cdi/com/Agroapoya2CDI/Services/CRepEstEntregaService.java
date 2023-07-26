package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CRepEstEntregaEntity;
import java.util.List;

public interface CRepEstEntregaService {

    public List<CRepEstEntregaEntity> ConsRepEntrega(Integer bandera, Integer CD_CNSCTVO, Integer ID_SECTOR, Integer CD_CNDCTOR);
}
