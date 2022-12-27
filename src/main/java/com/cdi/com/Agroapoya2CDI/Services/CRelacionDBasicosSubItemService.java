package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CRelacionDBasicosSubItemEntity;
import java.util.List;

public interface CRelacionDBasicosSubItemService {

    public List<CRelacionDBasicosSubItemEntity> ConsultaCRelacionDBasicosSubItem(Integer Bandera, Integer IdDtoBasico, Integer IdDtoRelacion, Integer IdSubitem);

}
