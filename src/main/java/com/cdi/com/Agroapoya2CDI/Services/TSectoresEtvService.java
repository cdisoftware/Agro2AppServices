package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.TSectoresEtvEntity;
import java.util.List;

public interface TSectoresEtvService {

    public List<TSectoresEtvEntity> ConsultaSectoresEtv(Integer bandera, String NOMBRE_SECTOR, Integer ID_ZONA, Integer CD_CNSCTIVO);
}
