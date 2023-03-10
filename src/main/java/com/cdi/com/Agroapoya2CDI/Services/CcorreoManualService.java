package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CcorreoManualEntity;
import java.util.List;

public interface CcorreoManualService {
    public List<CcorreoManualEntity> ConsultaCorreos(Integer Bandera, Integer IdEnvio, Integer IdSector, Integer Cd_cnctivo, Integer IdPlantilla, Integer IdEstado, String fecha);
}
