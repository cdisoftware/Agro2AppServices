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
            name = "paC_SectorBodega",
            procedureName = "paC_SectorBodega",
            resultClasses = CSectorBodegaEntity.class)
})
public class CSectorBodegaEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("NombreSector")
    public String NombreSector;
}
