package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CListaSectoresVigentesEntity;
import java.util.List;

public interface CListaSectoresVigenteService {

    public List<CListaSectoresVigentesEntity> ConsultaCListSectoresVigentes(CListaSectoresVigentesEntity entidad, Integer Bandera);
}
