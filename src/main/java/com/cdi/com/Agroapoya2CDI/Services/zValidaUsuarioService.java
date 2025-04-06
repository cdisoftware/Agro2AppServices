package com.cdi.com.Agroapoya2CDI.Services;


import com.cdi.com.Agroapoya2CDI.Entity.zValidaUsuarioEntity;
import java.util.List;


public interface zValidaUsuarioService {
    public List<zValidaUsuarioEntity> consValidaUsuario(Integer Bandera, Integer IdSector, String Provado, String Telefono, Integer Usucodig);
}
