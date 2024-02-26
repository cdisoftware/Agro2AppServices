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
            name = "admin_PesoTotalLibras",
            procedureName = "admin_PesoTotalLibras",
            resultClasses = adPesoTotalLibrasEntity.class)
})
public class adPesoTotalLibrasEntity {

    @Id
    @JsonProperty("IdProducto")
    public Integer IdProducto;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("PesoTotal")
    public Integer PesoTotal;

    @JsonProperty("CantidadTotal")
    public Integer CantidadTotal;
}
