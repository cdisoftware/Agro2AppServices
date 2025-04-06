package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.zConsultarPagosFiadoEntity;
import java.util.List;

public interface zConsultarPagosFiadoService {
    public List<zConsultarPagosFiadoEntity> consPagosFiado(String FechaInicio, String FechaFin, Integer CodigoUsuario, String Correo, String Telefono, Integer IDEstadoPago, Integer IdLocalidad);
}
