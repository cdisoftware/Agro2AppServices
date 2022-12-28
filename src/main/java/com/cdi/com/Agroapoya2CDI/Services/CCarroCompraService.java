package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CCarroComprasEntity;
import java.util.List;

public interface CCarroCompraService {

    public List<CCarroComprasEntity> ConsultaCCarroCompra(Integer Bandera, Integer Usucodig, Integer ID_CARRO);
}
