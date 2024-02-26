package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adPesoTotalLibrasEntity;
import java.util.List;

public interface adPesoTotalLibraService {

    public List<adPesoTotalLibrasEntity> ConsultaPesoTotalLibra(Integer Bandera, Integer Cd_cnctvo);
}
