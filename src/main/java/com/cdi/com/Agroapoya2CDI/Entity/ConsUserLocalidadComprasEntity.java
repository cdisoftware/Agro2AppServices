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
            name = "PaC_ConsUserLocalidadCompras",
            procedureName = "PaC_ConsUserLocalidadCompras",
            resultClasses = ConsUserLocalidadComprasEntity.class)
})
public class ConsUserLocalidadComprasEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("FECHA_CREACION")
    public String FECHA_CREACION;

    @JsonProperty("IdSector")
    public String IdSector;

    @JsonProperty("DSCRPCION_SCTOR")
    public String DSCRPCION_SCTOR;

    @JsonProperty("ID_CARRO")
    public String ID_CARRO;

    @JsonProperty("VLOR_PGAR")
    public String VLOR_PGAR;

    @JsonProperty("FechaCompra")
    public String FechaCompra;

    @JsonProperty("DireccionEntrega")
    public String DireccionEntrega;
}
