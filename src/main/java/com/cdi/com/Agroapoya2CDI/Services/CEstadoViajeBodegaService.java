package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CEstadoViajeBodegaEntity;
import java.util.List;

public interface CEstadoViajeBodegaService {

    public List<CEstadoViajeBodegaEntity> ConsCEstadoViajeBodg(Integer Bandera, Integer Cd_cnctivo, Integer Id_Sector);
}
