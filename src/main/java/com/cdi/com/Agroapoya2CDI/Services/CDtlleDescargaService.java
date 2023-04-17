package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CDtlleDescargasEntity;
import java.util.List;

public interface CDtlleDescargaService {

    public List<CDtlleDescargasEntity> ConsultaCDtlleDescarga(Integer bandera, Integer IdSecto, Integer Cd_cnsctivo);
}
