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
            name = "paT_SectoresEtv",
            procedureName = "paT_SectoresEtv",
            resultClasses = TSectoresEtvEntity.class)
})
public class TSectoresEtvEntity {

    @Id
    @JsonProperty("SCTOR_OFRTA")
    public Integer SCTOR_OFRTA;

    @JsonProperty("DSCRPCION_SCTOR")
    public String DSCRPCION_SCTOR;

    @JsonProperty("Id_zona")
    public Integer Id_zona;

    @JsonProperty("Temporal")
    public Integer Temporal;

    @JsonProperty("coordenadas")
    public String coordenadas;

    @JsonProperty("Ciudad")
    public String Ciudad;

}
