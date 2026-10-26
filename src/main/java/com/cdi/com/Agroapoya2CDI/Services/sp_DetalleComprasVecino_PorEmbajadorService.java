package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.sp_DetalleComprasVecino_PorEmbajadorEntity;
import java.util.List;

public interface sp_DetalleComprasVecino_PorEmbajadorService {

    public List<sp_DetalleComprasVecino_PorEmbajadorEntity> ConsultaDetalleComprasVecino(Integer UsucodigEmbajador, Integer UsucodigVecino);
}
