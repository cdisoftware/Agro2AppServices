package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adlistadoProductoEntity;
import java.util.List;

public interface adlistadoProductoService {

    public List<adlistadoProductoEntity> ConsultaAdListaProductos(Integer Bandera, Integer Cd_cnsctvo, Integer IdSector);
}
