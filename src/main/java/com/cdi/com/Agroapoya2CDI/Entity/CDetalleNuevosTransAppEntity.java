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
            name = "paC_DetalleNuevosTransApp",
            procedureName = "paC_DetalleNuevosTransApp",
            resultClasses = CDetalleNuevosTransAppEntity.class)
})
public class CDetalleNuevosTransAppEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("cd_cnctvo")
    public Integer cd_cnctvo;

    @JsonProperty("cordenadaFinca")
    public String cordenadaFinca;

    @JsonProperty("CoordenadaBodega")
    public String CoordenadaBodega;

    @JsonProperty("NombreBodega")
    public String NombreBodega;

    @JsonProperty("Distancia")
    public String Distancia;
}
