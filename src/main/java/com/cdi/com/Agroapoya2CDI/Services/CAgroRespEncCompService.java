package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroRespEncCompEntity;
import java.util.List;

public interface CAgroRespEncCompService {

    public List<CAgroRespEncCompEntity> ConsultaCAgroRespEncComp(Integer bandera, String ID_COMPRA);
}
