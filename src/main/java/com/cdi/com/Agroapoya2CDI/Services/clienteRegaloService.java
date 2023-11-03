package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.clienteRegaloEntity;
import java.util.List;

public interface clienteRegaloService {

    public List<clienteRegaloEntity> ConsultaRegaloCliente(Integer Bandera, Integer IntIdOferta, Integer Usucodig);
}
