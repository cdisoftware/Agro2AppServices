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
            name = "paC_DatosBasicosSubItem",
            procedureName = "paC_DatosBasicosSubItem",
            resultClasses = CDatBasicSubItemEntity.class)
})
public class CDatBasicSubItemEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("DSCRIPCION")
    public String DSCRIPCION;

    @JsonProperty("ESTADO")
    public Integer ESTADO;

    @JsonProperty("DSCRIPCIONDOS")
    public Integer DSCRIPCIONDOS;
}
