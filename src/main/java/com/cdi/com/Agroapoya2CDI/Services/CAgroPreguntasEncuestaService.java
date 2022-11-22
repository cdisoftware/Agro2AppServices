package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroPreguntasEncuestaEntity;
import java.util.List;

public interface CAgroPreguntasEncuestaService {

    public List<CAgroPreguntasEncuestaEntity> ConsultaCAgroPreguntEnc(Integer bandera, String CD_CNSCTVO, String ID_SCTOR_OFRTA);
}
