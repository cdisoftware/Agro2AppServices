package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CPinUltimaMillaEntity;
import java.util.List;

public interface CPinUltimaMillaService {

    public List<CPinUltimaMillaEntity> consultaCPinUltiMilla(Integer Bandera, Integer cd_cnctvo, Integer idSector, Integer IdGrupo);
}
