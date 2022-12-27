package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CDatBasicSubItemEntity;
import java.util.List;

public interface CDatBasicSubItemService {

    public List<CDatBasicSubItemEntity> ConsultaCDatBasicSubItem(CDatBasicSubItemEntity entidad, Integer Bandera, Integer IdDatoBasico);
}
