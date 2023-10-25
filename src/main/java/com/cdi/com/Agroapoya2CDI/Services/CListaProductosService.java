package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CListaProductosEntity;
import java.util.List;

public interface CListaProductosService {

    public List<CListaProductosEntity> ConsultaCListaProduct(CListaProductosEntity entidad, Integer Bandera);
}
