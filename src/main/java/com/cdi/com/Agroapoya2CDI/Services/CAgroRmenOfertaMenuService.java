package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroRmenOfertaMenuEntity;
import java.util.List;

public interface CAgroRmenOfertaMenuService {

    public List<CAgroRmenOfertaMenuEntity> ConsultaResumenOfertaMenu(Integer bandera, String CD_CNSCTVO);
}
