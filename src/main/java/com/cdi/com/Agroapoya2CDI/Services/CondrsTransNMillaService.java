package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CondrsTransNMillaEntity;
import java.util.List;

public interface CondrsTransNMillaService {

    public List<CondrsTransNMillaEntity> consultaCondrsTransNMilla(Integer Bandera, Integer usucodigTrans, Integer IdGrupo);
}
