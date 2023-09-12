package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CinfoManyCompraEntity;
import java.util.List;

public interface CinfoManyCompraService {

    public List<CinfoManyCompraEntity> ConsultaInfoManyCompra(Integer Bandera, Integer id_Carro);
}
