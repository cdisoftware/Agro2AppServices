package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.PagosElectronicosToppingsEntity;
import java.util.List;

public interface PagosElectronicosToppingService {

    public List<PagosElectronicosToppingsEntity> ConsultaPagosElectronicosTopping(Integer Bandera, String Id_carro);
}
