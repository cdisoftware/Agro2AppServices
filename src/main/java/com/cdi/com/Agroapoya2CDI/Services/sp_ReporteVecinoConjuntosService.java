
package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.sp_ReporteVecinoConjuntosEntity;


public interface sp_ReporteVecinoConjuntosService {
     public java.util.List<sp_ReporteVecinoConjuntosEntity> ConsultaVecino(Integer Bandera, Integer IdEmbajador, String correoEmbajador, Integer IdVecino, String correoVecino);
}
