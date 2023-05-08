package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CdetalleAppEntity;
import java.util.List;

public interface CdetalleAppService {

    public List<CdetalleAppEntity> ConsultaDetalleApp(Integer Bandera, Integer UsucodigTrans, Integer cd_cnsctivo, Integer Sector);
}
