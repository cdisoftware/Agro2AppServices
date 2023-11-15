package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adMillaSectoresEntity;
import java.util.List;

public interface adMillaSectoreService {

    public List<adMillaSectoresEntity> consultaAdMillaSectores(Integer Bandera, Integer IdSector);
}
