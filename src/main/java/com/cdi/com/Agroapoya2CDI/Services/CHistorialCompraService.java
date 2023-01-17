package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CHistorialComprasEntity;
import java.util.List;

public interface CHistorialCompraService {

    public List<CHistorialComprasEntity> ConsultaCHistorialCompra(Integer Bandera, Integer Usucodig, Integer ID_CARRO);
}
