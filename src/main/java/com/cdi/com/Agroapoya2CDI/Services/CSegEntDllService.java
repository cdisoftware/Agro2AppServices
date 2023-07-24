package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CSegEntDllEntity;
import java.util.List;

public interface CSegEntDllService {

    public List<CSegEntDllEntity> ConsSeguimientoEntregasDetalle(Integer bandera, Integer ID_CRRO);
}
