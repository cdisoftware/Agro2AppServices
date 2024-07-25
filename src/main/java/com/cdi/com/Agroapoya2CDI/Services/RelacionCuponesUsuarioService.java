package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.RelacionCuponesUsuarioEntity;
import java.util.List;

public interface RelacionCuponesUsuarioService {

    public List<RelacionCuponesUsuarioEntity> ConsultaRelaCuponesUser(Integer Bandera, Integer Usucodig);
}
