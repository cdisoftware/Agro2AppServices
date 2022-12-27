package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.TDatosBasicosEntity;
import java.util.List;

public interface TDatosBasicosService {

    public List<TDatosBasicosEntity> ConsultaTDatosBasic(Integer Bandera, Integer IdModulo);
}
