package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CInfoOfertaEntity;
import java.util.List;

public interface CInfoOfertaService {

    public List<CInfoOfertaEntity> ConsultaInfoOferta(Integer bandera, Integer CD_CNSCTVO, Integer Id_sector);
}
