package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adminMillaTransportesEntity;
import java.util.List;

public interface adminMillaTransporteService {

    public List<adminMillaTransportesEntity> ConsultaAdminMillaTransporte(Integer Bandera, Integer IdGrupo);
}
