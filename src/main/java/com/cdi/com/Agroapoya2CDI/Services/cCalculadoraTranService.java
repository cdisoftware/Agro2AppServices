package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.cCalculadoraTransEntity;
import java.util.List;

public interface cCalculadoraTranService {

    public List<cCalculadoraTransEntity> consultaCalculadoraTrans(cCalculadoraTransEntity entidad, Integer Bandera, Integer Formato, Integer Unidades, Integer IdCarro);
}
