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
            name = "paC_ListaConductor",
            procedureName = "paC_ListaConductor",
            resultClasses = CListaConductorEntity.class)
})
public class CListaConductorEntity {

    @Id
    @JsonProperty("ID_CNDCTOR")
    public Integer ID_CNDCTOR;

    @JsonProperty("NMBRE_CNDCTOR")
    public String NMBRE_CNDCTOR;

    @JsonProperty("PLCA")
    public String PLCA;

    @JsonProperty("TEL_CNDCTOR")
    public String TEL_CNDCTOR;

    @JsonProperty("DIRECCION")
    public String DIRECCION;

    @JsonProperty("COORDENADAS")
    public String COORDENADAS;
}
