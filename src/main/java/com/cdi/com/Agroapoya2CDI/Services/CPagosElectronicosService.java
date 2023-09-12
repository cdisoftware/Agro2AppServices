package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CPagosElectronicosEntity;
import java.util.List;

public interface CPagosElectronicosService {

    public List<CPagosElectronicosEntity> ConsultaCPagosElectronicos(Integer Bandera, Integer Id_carro);
}
