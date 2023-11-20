package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.COfertasExternasEntity;
import java.util.List;

public interface COfertasExternasService {

    public List<COfertasExternasEntity> ConsultaCOfertasExt(Integer Bandera, Integer Cd_cnctvo, Integer Id_Sector, Integer IdUsuario, String NombreProducto);
}
