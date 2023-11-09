package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.EnvioCorreoContactanosEntity;

public interface EnvioCorreoContactanoService {

    public String EnvioCorreoClienteCantactanos(EnvioCorreoContactanosEntity entidad,
            Integer bandera, Integer TipoContanto);
}
