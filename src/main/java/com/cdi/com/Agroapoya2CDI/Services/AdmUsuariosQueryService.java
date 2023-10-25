package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.AdmUsuariosQueryEntity;
import java.util.List;

public interface AdmUsuariosQueryService {

    public List<AdmUsuariosQueryEntity> ConsultAdminUsuariosQuery(AdmUsuariosQueryEntity entidad, Integer Bandera);
}
