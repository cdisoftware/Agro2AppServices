package com.cdi.com.Agroapoya2CDI.Services;


import com.cdi.com.Agroapoya2CDI.Entity.zembajadorConjuntosReporteEntity;
import java.util.List;

public interface zembajadorConjuntosReporteService {
   public List<zembajadorConjuntosReporteEntity> consEmbajadorConjuntosReporte(Integer Bandera, String Fechainicio, String Fechafin, Integer UsucodigEmbajador, String CorreoEmbajador, String TelefonoEmbajador, Integer UsucodigVecino, String CorreoVecino, String TelefonoVecino);
}
