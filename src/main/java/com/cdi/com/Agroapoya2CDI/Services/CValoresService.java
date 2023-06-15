package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CValoresEntity;
import java.util.List;

public interface CValoresService {

    public List<CValoresEntity> ConsultaCValores(Integer Bandera, Integer Cd_cnsctvo, Integer IdSector);
}
