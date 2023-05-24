package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CCompraGrupalesEntity;
import java.util.List;

public interface CCompraGrupalesService {

    public List<CCompraGrupalesEntity> ConsCompraGrpal(Integer Bandera, Integer IdGrupo, Integer Cd_cnsctivo, Integer Id_Sector, Integer IdCarro);
}
