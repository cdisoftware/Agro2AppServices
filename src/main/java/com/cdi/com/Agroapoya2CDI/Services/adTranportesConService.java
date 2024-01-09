package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adTranportesConsEntity;
import java.util.List;

public interface adTranportesConService {

    public List<adTranportesConsEntity> ConsultAdmTransportesAsigna(Integer Bandera, Integer cd_cnsctivo, Integer idSector, String fechaDesde, String fechaHasta);
}
