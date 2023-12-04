package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.admin_segValoresTotalesEntity;
import java.util.List;

public interface admin_segValoresTotalesService {
    public List<admin_segValoresTotalesEntity> conscalculadora(Integer Bandera, Integer IdGrupo);
}