package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CinfoOfertaGrupoEntity;
import java.util.List;

public interface CinfoOfertaGrupoService {

    public List<CinfoOfertaGrupoEntity> consultaInfOfertaGp(Integer Bandera, String codigo_Mostrar);
}
