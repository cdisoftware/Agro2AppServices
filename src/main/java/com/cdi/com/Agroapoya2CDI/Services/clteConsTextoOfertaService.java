package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.clteConsTextoOfertaEntity;
import java.util.List;

public interface clteConsTextoOfertaService {

    public List<clteConsTextoOfertaEntity> ConsultaClienteTextOferta(Integer Bandera, Integer cd_cnsctivo, Integer idsector);
}
