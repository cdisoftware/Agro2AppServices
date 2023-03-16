package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.pa_CTextosOfertaConsultaEntity;
import java.util.List;

public interface pa_CTextosOfertaConsultaService {
    public List<pa_CTextosOfertaConsultaEntity> ConsTextyOfer(Integer Bandera, Integer idSector, Integer cd_cnctivo);
}
