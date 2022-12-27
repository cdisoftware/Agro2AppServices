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
            name = "paC_RelacionDBasicosSubItems",
            procedureName = "paC_RelacionDBasicosSubItems",
            resultClasses = CRelacionDBasicosSubItemEntity.class)
})
public class CRelacionDBasicosSubItemEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("DESCRIPCION")
    public String DESCRIPCION;

    @JsonProperty("PERTENECE")
    public Integer PERTENECE;
}
