package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CTransActHisEntity;
import java.util.List;

public interface CTransActHisService {

    public List<CTransActHisEntity> ConsCTransActHis(Integer bandera, Integer id_condutor, Integer usucodigTrans);
}
