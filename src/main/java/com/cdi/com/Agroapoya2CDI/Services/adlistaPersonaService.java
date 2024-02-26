package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adlistaPersonaEntity;
import java.util.List;

public interface adlistaPersonaService {

    public List<adlistaPersonaEntity> consultaadlistaPersona(adlistaPersonaEntity entidad,
            Integer Bandera, Integer Cd_tpo_usuario, Integer Usucodig, Integer TipoRegistro, Integer RegistroValidado);
}
