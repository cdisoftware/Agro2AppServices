
package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.sp_ConsultarPagosPorEmbajadorEntity;


public interface sp_ConsultarPagosPorEmbajadorService {
    public java.util.List<sp_ConsultarPagosPorEmbajadorEntity> ConsultaRelacionEmbajador(Integer Bandera, String UsucodigEmbajador, String UsucodigVecino);
}
