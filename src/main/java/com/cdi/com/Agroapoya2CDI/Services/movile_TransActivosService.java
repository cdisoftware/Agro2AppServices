package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.movile_TransActivosEntity;
import java.util.List;

public interface movile_TransActivosService {

    public List<movile_TransActivosEntity> CosultaGeneralEntregaMovile(Integer bandera, Integer IdConductor, Integer UsuCodTrans, Integer IdGrupoMilla);
}
