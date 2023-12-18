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
            name = "cliente_infoCompra",
            procedureName = "cliente_infoCompra",
            resultClasses = clienteinfoCompraEntity.class)
})
public class clienteinfoCompraEntity {

    @Id
    @JsonProperty("cd_cnsctvo")
    public Integer cd_cnsctvo;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("FechaCompra")
    public String FechaCompra;

    @JsonProperty("FechaEntrega")
    public String FechaEntrega;

    @JsonProperty("EstadoEntrega")
    public Integer EstadoEntrega;

    @JsonProperty("DesEntrega")
    public String DesEntrega;
}
