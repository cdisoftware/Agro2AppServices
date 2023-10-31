package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.ConsultaSectoresEntity;
import java.util.List;

public interface ConsultaSectoreService {

    public List<ConsultaSectoresEntity> ConsultaSectores(Integer bandera, Integer CD_CNSCTVO, Integer IdSector);
}
