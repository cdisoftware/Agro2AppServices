package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroPreguntaOfertaEntity;
import java.util.List;

public interface CAgroPreguntaOfertaService {

    public List<CAgroPreguntaOfertaEntity> ConsultaCAgroPreguntOfert(CAgroPreguntaOfertaEntity entidad, Integer bandera);
}
