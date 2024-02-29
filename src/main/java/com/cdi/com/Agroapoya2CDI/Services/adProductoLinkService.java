package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adProductoLinksEntity;
import java.util.List;

public interface adProductoLinkService {

    public List<adProductoLinksEntity> ConsultaProductoLinks(Integer Bandera, Integer TipoLink, Integer cd_prdcto);
}
