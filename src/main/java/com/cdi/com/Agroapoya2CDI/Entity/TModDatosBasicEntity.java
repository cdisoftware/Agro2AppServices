package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paT_ModuloDatosBasicos",
            procedureName = "paT_ModuloDatosBasicos",
            resultClasses = TModDatosBasicEntity.class)
})
public class TModDatosBasicEntity {

    @Id
    @JsonProperty("IdModulo")
    public Integer IdModulo;

    @JsonProperty("Descripcion")
    public String Descripcion;
}
