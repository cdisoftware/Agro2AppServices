package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.ComprasOfertaEntity;
import java.util.List;

public interface ComprasOfertaService {

    public List<ComprasOfertaEntity> ConsultaComprasOferta(Integer bandera, Integer CD_CNSCTVO);
}
