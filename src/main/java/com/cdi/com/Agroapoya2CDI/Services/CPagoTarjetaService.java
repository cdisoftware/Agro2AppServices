package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CPagoTarjetaEntity;
import java.util.List;

public interface CPagoTarjetaService {

    public List<CPagoTarjetaEntity> ConsulPagoTarjeta(Integer Bandera, Integer Usucodig, Integer IdCarro);
}
