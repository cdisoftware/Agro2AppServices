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
            name = "pac_infoManyCompra",
            procedureName = "pac_infoManyCompra",
            resultClasses = CinfoManyCompraEntity.class)
})
public class CinfoManyCompraEntity {

    @Id
    @JsonProperty("CodigoPedido")
    public Integer CodigoPedido;

    @JsonProperty("FechaEntrega")
    public String FechaEntrega;

    @JsonProperty("id_manychat")
    public String id_manychat;
}
