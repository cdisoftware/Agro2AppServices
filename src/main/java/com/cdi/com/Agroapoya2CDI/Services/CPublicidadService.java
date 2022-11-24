package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CPublicidadEntity;
import java.util.List;

public interface CPublicidadService {

    public List<CPublicidadEntity> ConsultaCPublicidad(Integer Bandera, Integer IdVista, Integer Usucodig);

}
