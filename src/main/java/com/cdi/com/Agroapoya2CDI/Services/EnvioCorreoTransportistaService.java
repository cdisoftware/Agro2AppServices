package com.cdi.com.Agroapoya2CDI.Services;

import org.springframework.web.multipart.MultipartFile;

public interface EnvioCorreoTransportistaService {
    public String EnvioPdfTrans(MultipartFile file);
}
