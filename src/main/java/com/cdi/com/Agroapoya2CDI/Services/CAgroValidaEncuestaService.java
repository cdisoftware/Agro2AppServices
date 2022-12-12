package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroValidaEncuestaEntity;
import java.util.List;

public interface CAgroValidaEncuestaService {

    public List<CAgroValidaEncuestaEntity> ConsultaCAgroValEncuestas(Integer bandera, String ID_COMPRA);
}
