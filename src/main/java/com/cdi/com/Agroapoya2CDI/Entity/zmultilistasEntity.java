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
            name = "z_multilistas",
            procedureName = "z_multilistas",
            resultClasses = zmultilistasEntity.class)
})

public class zmultilistasEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Descripcion")
    public String Descripcion;
}
