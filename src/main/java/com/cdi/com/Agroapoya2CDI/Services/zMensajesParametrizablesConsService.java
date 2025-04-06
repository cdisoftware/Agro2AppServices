package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.zMensajesParametrizablesConsEntity;
import java.util.List;

public interface zMensajesParametrizablesConsService {

    public List<zMensajesParametrizablesConsEntity> consMensajesParametrizables(Integer Bandera, Integer usucodig, String CorreoPersona);
}
