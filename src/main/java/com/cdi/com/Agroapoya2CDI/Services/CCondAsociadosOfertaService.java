package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CCondAsociadosOfertaEntity;
import java.util.List;

public interface CCondAsociadosOfertaService {

    public List<CCondAsociadosOfertaEntity> ConsultaCondAsociadosOferta(Integer Bandera, Integer cd_cnsctivo, Integer idSector, Integer idTipoTrans);
}
