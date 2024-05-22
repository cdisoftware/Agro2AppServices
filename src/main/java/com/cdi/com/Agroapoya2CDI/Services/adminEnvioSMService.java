package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adminEnvioSMSEntity;
import java.util.List;

public interface adminEnvioSMService {

    public List<adminEnvioSMSEntity> ConsultaEnvioSMS(Integer Bandera, Integer idSector);
}
