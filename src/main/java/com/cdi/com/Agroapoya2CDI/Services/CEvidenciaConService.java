package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CEvidenciaConsEntity;
import java.util.List;

public interface CEvidenciaConService {

    public List<CEvidenciaConsEntity> ConsEvidenciaCon(Integer Bandera, Integer IdGrupo, Integer Cd_cnsctivo, Integer Id_Sector, Integer IdCarro, Integer IdEvidencia);
}
