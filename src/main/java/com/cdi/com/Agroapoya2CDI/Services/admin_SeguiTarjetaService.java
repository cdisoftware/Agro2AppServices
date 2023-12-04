package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.admin_SeguiTarjetaEntity;
import java.util.List;

public interface admin_SeguiTarjetaService {
    public List<admin_SeguiTarjetaEntity> ConsSegTar(Integer Bandera, Integer IdGrupo);
}