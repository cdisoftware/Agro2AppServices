package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adReporteTransGeneralEntity;
import java.util.List;

public interface adReporteTransGeneralService {

    public List<adReporteTransGeneralEntity> ConsultaRepoteTransGen(Integer bandera, String IdGrupoMilla);
}
