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
            name = "admin_millaDetalleOfertaCompra",
            procedureName = "admin_millaDetalleOfertaCompra",
            resultClasses = admillaDtlleOfertaCompraEntity.class)
})
public class admillaDtlleOfertaCompraEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("DesSector")
    public String DesSector;

    @JsonProperty("NumeroDeCompras")
    public Integer NumeroDeCompras;

}
