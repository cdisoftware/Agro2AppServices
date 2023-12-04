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
            name = "paC_SeguimientoEntregasDetalle",
            procedureName = "paC_SeguimientoEntregasDetalle",
            resultClasses = CSegEntDllEntity.class)
})
public class CSegEntDllEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("Cantidad")
    public Integer Cantidad;

    @JsonProperty("valor")
    public String valor;

    @JsonProperty("IdDevuelto")
    public Integer IdDevuelto;

    @JsonProperty("DescDevuelto")
    public String DescDevuelto;

    @JsonProperty("ValorReal")
    public Integer ValorReal;
}
