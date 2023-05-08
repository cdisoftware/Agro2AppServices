package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CNuevosTransAppEntity;
import java.util.List;

public interface CNuevosTransAppService {

    public List<CNuevosTransAppEntity> consultaCNewTransApp(Integer Bandera, Integer UsucodigTrans);
}
