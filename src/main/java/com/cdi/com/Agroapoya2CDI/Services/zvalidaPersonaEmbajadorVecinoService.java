package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.zvalidaPersonaEmbajadorVecinoEntity;
import java.util.List;

public interface zvalidaPersonaEmbajadorVecinoService {

    public List<zvalidaPersonaEmbajadorVecinoEntity> consValidaPersonaEmbajador(Integer Bandera, String CorreoPersona, Integer UsucodigEmbajador);
}
