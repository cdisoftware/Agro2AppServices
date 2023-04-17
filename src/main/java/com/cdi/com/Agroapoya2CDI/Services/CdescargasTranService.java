package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CdescargasTransEntity;
import java.util.List;

public interface CdescargasTranService {

    public List<CdescargasTransEntity> ConsultaCDescargasTrans(Integer Bandera, Integer cd_cnctvo);
}
