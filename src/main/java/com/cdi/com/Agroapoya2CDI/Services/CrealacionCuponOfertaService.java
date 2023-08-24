package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CrealacionCuponOfertaEntity;
import java.util.List;

public interface CrealacionCuponOfertaService {

    public List<CrealacionCuponOfertaEntity> ConsultaRealacionCuponOferta(Integer Bandera, Integer cd_cnsctvo, Integer codigo_grupo);
}
