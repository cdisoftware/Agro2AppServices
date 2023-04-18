package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CValorUbersGeneralEntity;
import java.util.List;

public interface CValorUbersGeneralService {

    public List<CValorUbersGeneralEntity> consultaCValorUbersGen(Integer Bandera, Integer IdeDepto, Integer IdCiudad);
}
