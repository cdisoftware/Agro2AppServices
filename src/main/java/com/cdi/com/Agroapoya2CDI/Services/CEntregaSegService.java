package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CEntregaSegEntity;
import java.util.List;

public interface CEntregaSegService {

    public List<CEntregaSegEntity> ConsultaCEntregaSeg(Integer Bandera, Integer cd_cnscutivo, Integer IdSector);
}
