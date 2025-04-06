package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.zPersonaClienteConsEntity;
import java.util.List;

public interface zPersonaClienteConsService {
    public List<zPersonaClienteConsEntity>consPersonaCliente(Integer IdUsuario, String Correo, Integer NumeroCompras, String Telefono, String NombreApellido, Integer Localidad);
}
