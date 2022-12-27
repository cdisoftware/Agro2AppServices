package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CMascaraDatBasicEntity;
import java.util.List;

public interface CMascaraDatBasicService {

    public List<CMascaraDatBasicEntity> consultaCMascaraDatBasic(Integer Bandera, Integer IdDtoBasico);
}
