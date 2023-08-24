package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CCodigosDescuentoEntity;
import java.util.List;

public interface CCodigosDescuentoService {

    public List<CCodigosDescuentoEntity> ConsultaCodigosDescuentos(CCodigosDescuentoEntity entidad, Integer Bandera,
            Integer agro_tipoCuponDescuentoGeneral, Integer IdTipoCuponCodigoAplicableGeneral, Integer Cd_cnsctvo, Integer Estado);
}
