package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.ClistaPersonaEntity;
import java.util.List;

public interface ClistaPersonaService {

    public List<ClistaPersonaEntity> ConsultaListaPersona(ClistaPersonaEntity entidad, Integer Bandera);
}
