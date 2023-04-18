package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CultimMillaEntity;
import java.util.List;

public interface CultimMillaService {

    public List<CultimMillaEntity> ConsultaCuLtMilla(Integer Bandera, Integer cd_cnsctvo, Integer id_sector);
}
