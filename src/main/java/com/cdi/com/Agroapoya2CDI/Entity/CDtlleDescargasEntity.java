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
            name = "paC_DtlleDescargas",
            procedureName = "paC_DtlleDescargas",
            resultClasses = CDtlleDescargasEntity.class)
})
public class CDtlleDescargasEntity {

    @Id
    @JsonProperty("IdDescarga")
    public Integer IdDescarga;

    @JsonProperty("cd_cnctvo")
    public Integer cd_cnctvo;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("CantidadMax")
    public Integer CantidadMax;

    @JsonProperty("KilosMax")
    public Integer KilosMax;

    @JsonProperty("DistanciaMax")
    public Integer DistanciaMax;

}
