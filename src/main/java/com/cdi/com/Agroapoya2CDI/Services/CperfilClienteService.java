package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CperfilClienteEntity;
import java.util.List;

public interface CperfilClienteService {

    public List<CperfilClienteEntity> CosnultaCPerfilClient(CperfilClienteEntity entidad, Integer bandera);
}
