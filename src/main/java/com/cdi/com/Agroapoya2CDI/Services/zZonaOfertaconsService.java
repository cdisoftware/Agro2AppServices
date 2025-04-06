package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.zZonaOfertaconsEntity;
import java.util.List;

public interface zZonaOfertaconsService {

    public List<zZonaOfertaconsEntity> consZonaOferta(Integer Bandera, String Localidad, Integer IdZona, Integer IdEstado);
}
