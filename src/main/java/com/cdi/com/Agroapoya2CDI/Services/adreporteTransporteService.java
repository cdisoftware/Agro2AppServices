package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.adreporteTransportEntity;
import java.util.List;

public interface adreporteTransporteService {

    public List<adreporteTransportEntity> ConsultaReporteTransport(Integer Bandera, String IdsOferta, String IdsGrupo, String FechaIncio, String FechaFin);

}
