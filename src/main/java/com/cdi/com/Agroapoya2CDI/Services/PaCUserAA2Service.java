package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.PaCUserAA2Entity;
import java.util.List;

public interface PaCUserAA2Service {

    public List<PaCUserAA2Entity> consultaCUsersAA2(PaCUserAA2Entity entidad, Integer Bandera, Integer TipoUser);
}
