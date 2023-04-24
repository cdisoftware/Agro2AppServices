package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CReporteOfertasEntity;
import java.util.List;

public interface CReporteOfertaService {

    public List<CReporteOfertasEntity> CosnultaCReportOferta(CReporteOfertasEntity entidad, Integer Bandera, Integer cd_cnscutivo, Integer Id_Estado_oferta, Integer cd_producto);
}
