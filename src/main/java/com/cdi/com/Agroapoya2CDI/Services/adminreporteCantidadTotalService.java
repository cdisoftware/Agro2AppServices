package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adminreporteCantidadTotalEntity;
import java.util.List;

public interface adminreporteCantidadTotalService {

    public List<adminreporteCantidadTotalEntity> ConsultaAdminReporteTotal(Integer Bandera, Integer cd_cnsctivo);
}
