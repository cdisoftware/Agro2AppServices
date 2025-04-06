package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.zMapaCalorconsEntity;
import java.util.List;

public interface zMapaCalorconsService {
    public List<zMapaCalorconsEntity> consMapaCalor(Integer Bandera, String FechaIncioCompra, String FechaFinCompra, String FechaRegistro, Integer IdLocalidad, Integer NumCompras);
}