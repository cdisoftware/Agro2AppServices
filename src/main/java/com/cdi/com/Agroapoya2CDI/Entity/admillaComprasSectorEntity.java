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
            name = "admin_millaComprasSector",
            procedureName = "admin_millaComprasSector",
            resultClasses = admillaComprasSectorEntity.class)
})
public class admillaComprasSectorEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdCarro")
    public Integer IdCarro;

    @JsonProperty("CoordenadasEntrega")
    public String CoordenadasEntrega;

    @JsonProperty("DireccionEntrega")
    public String DireccionEntrega;
}
