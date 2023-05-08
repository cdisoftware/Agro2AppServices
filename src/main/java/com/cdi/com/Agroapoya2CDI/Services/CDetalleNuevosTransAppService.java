package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CDetalleNuevosTransAppEntity;
import java.util.List;

public interface CDetalleNuevosTransAppService {

    public List<CDetalleNuevosTransAppEntity> consultaCdtlleNewTransApp(Integer Bandera, Integer Cd_cnsctvo, Integer Id_grupo);
}
