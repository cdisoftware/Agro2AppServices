package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CTransportesEntity;
import java.util.List;

public interface CTransporteService {

    public List<CTransportesEntity> consultaCTransporte(Integer Bandera, Integer cd_cnctivo, Integer IdSector);
}
