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
            name = "admin_millaEntregaDisponible",
            procedureName = "admin_millaEntregaDisponible",
            resultClasses = admillaEntregaDisponibleEntity.class)
})
public class admillaEntregaDisponibleEntity {

    @Id
    @JsonProperty("id_carro")
    public Integer id_carro;

    @JsonProperty("DireccionEntrega")
    public String DireccionEntrega;

    @JsonProperty("CoordenadasEntrega")
    public String CoordenadasEntrega;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("NombresCliente")
    public String NombresCliente;

    @JsonProperty("OfertaSector")
    public String OfertaSector;
}
