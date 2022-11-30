package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CseguimientoEntity;
import java.util.List;

public interface CseguimientoService {

    public List<CseguimientoEntity> ConsultaCSeguimiento(Integer Bandera, Integer IdCliente);
}
