package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.EnvioCorreo_IndividualEntity;
import org.springframework.web.multipart.MultipartFile;

public interface EnvioCorreoTransportistaService {
    public String EnvioPdfTrans(Integer bandera, Integer Id_Clnte, Integer IdSctor, Integer IdPlantilla, Integer usucodig, Integer Cd_cnctvo, MultipartFile file);
}