package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adreporteUsuarioServEntity;
import java.util.List;

public interface adreporteUsuarioServService {

    public List<adreporteUsuarioServEntity> ConsultaReporteUsuarios(adreporteUsuarioServEntity entidad, Integer Bandera, Integer IdLocalidad);
}
