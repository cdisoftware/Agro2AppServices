package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CSubSeguimientoEntity;
import java.util.List;

public interface CSubSeguimientoService {

    public List<CSubSeguimientoEntity> ConsultaCSubSeguimiento(Integer Bandera, Integer IdCliente, Integer IdSeguimiento);
}
