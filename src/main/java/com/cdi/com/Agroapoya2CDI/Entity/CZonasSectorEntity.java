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
            name = "paC_ZonasSector",
            procedureName = "paC_ZonasSector",
            resultClasses = CZonasSectorEntity.class)
})
public class CZonasSectorEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("Descripcion")
    public String Descripcion;
}
