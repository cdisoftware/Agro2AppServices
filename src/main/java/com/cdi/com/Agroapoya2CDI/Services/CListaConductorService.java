package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CListaConductorEntity;
import java.util.List;

public interface CListaConductorService {

    public List<CListaConductorEntity> ConsultaCListaConductor(Integer Bandera, Integer cd_cnsctivo, Integer idSector);
}
