package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.mvconsultaEvidenciaEntity;
import java.util.List;

public interface mvconsultaEvidenciaService {

    public List<mvconsultaEvidenciaEntity> ConsultaEvidenciaMovile(Integer Bandera, Integer id_evidencia, Integer id_factura);
}
