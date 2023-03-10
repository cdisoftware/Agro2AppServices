package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CusuariosCorreoEntity;
import java.util.List;

public interface CusuariosCorreoService {
    public List<CusuariosCorreoEntity> ConsCooreos(Integer Bandera, Integer TipoPersona, String Correopersona, String NombrePersona);
}
