package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.agroDescuentoConsultaEntity;
import java.util.List;

public interface agroDescuentoConsultaService {

    public List<agroDescuentoConsultaEntity> CosnultaAgroDescuento(Integer Bandera, Integer Cd_cnsctvo, Integer Id_sector);
}
