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
            name = "paC_Valores",
            procedureName = "paC_Valores",
            resultClasses = CValoresEntity.class)
})
public class CValoresEntity {

    @Id
    @JsonProperty("IdValor")
    public Integer IdValor;

    @JsonProperty("Cd_cnsctvo")
    public Integer Cd_cnsctvo;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("ValorUnidad")
    public String ValorUnidad;

    @JsonProperty("Orden")
    public Integer Orden;

    @JsonProperty("OrdenMostrar")
    public String OrdenMostrar;
}
