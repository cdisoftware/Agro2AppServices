package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CEjecutaSenteciaSQLEntity;
import java.util.List;

public interface CEjecutaSenteciaSQLService {

    public List<CEjecutaSenteciaSQLEntity> ConsultaSentenciaSQL(CEjecutaSenteciaSQLEntity entidad, Integer bandera);
}
