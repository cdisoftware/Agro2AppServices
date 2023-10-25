package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.movileConsulatGeneralOfertaEntity;
import java.util.List;

public interface movileConsulatGeneralOfertaService {

    public List<movileConsulatGeneralOfertaEntity> consultaGenOfertaMovile(Integer Bandera, Integer IdCarro);
}
