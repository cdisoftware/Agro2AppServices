package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CRelacionDatosBasicosEntity;
import java.util.List;

public interface CRelacionDatosBasicoService {

    public List<CRelacionDatosBasicosEntity> ConsultaCRelacionDatosBasicos(Integer Bandera, Integer IdDtoBasico);
}
