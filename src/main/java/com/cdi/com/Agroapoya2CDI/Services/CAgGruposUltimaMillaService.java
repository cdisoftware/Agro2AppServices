package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CAgro_GruposUltimaMillaEntity;
import java.util.List;

public interface CAgGruposUltimaMillaService {

    public List<CAgro_GruposUltimaMillaEntity> ConsultaGrupoUltMilla(Integer Bandera, Integer idGrupo);
}
