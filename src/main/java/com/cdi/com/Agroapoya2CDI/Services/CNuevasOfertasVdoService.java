package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CNuevasOfertasVdosEntity;
import java.util.List;

public interface CNuevasOfertasVdoService {

    public List<CNuevasOfertasVdosEntity> ConsultaCNuevasOfertasVdo(Integer Bandera, Integer Usucodig, Integer Cd_cnctvo, Integer Id_Sector);
}
