package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.TipObliCorreoManualEntity;
import java.util.List;

public interface TipObliCorreoManualService {

    public List<TipObliCorreoManualEntity> ConsultaObliCorreoMan(Integer Bandera, Integer IdPlantilla);
}
