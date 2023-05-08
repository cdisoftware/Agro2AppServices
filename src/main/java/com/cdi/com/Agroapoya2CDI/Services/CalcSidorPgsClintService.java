package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CalcSidorPgsClintEntity;
import java.util.List;

public interface CalcSidorPgsClintService {

    public List<CalcSidorPgsClintEntity> consCalSimuladorCliente(CalcSidorPgsClintEntity entidad, Integer Bandera, Integer Operacion, Integer Formato, Integer Cd_Cnsctvo,
            Integer Id_Sector, Integer Unidades, Integer Usucodig, String CodGrupo, Integer undParti);
}
