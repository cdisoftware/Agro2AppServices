package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CTrazabilidadEstadoOfertaEntity;
import java.util.List;

public interface CTrazabilidadEstadoOfertaService {

    public List<CTrazabilidadEstadoOfertaEntity> ConsultaTranzEstOferta(Integer bandera, String CD_CNSCTVO);
}
