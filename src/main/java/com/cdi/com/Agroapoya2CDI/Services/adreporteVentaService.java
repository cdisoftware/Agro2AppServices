package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adreporteVentasEntity;
import java.util.List;

public interface adreporteVentaService {

    public List<adreporteVentasEntity> ConsultaAdminReporteVentas(adreporteVentasEntity entidad, 
            Integer Bandera, Integer cd_cnscutivo, Integer IdSector, Integer Id_Estado_Compra, Integer Id_Estado_pago);
}
