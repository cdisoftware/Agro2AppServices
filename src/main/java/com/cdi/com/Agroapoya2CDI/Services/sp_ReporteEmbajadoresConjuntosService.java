
package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.sp_ReporteEmbajadoresConjuntosEntity;
import java.util.List;
public interface sp_ReporteEmbajadoresConjuntosService {
    public List<sp_ReporteEmbajadoresConjuntosEntity> ConsultaEmbajador(Integer Bandera, Integer IdEmbajador, String correoEmbajador);
}
