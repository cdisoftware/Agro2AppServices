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
            name = "admin_reporteCantidadTotal",
            procedureName = "admin_reporteCantidadTotal",
            resultClasses = adminreporteCantidadTotalEntity.class)
})
public class adminreporteCantidadTotalEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("imagen")
    public String imagen;

    @JsonProperty("CantidadTotal")
    public Integer CantidadTotal;
}
