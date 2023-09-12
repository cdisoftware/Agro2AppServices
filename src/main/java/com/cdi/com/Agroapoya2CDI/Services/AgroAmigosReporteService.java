package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.AgroAmigosReporteEntity;
import java.util.List;

public interface AgroAmigosReporteService {

    public List<AgroAmigosReporteEntity> ConsultaAgroAmigosReport(Integer Bandera, Integer Usucodig);
}
