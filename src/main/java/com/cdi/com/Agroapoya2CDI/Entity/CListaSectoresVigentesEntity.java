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
            name = "paC_ListaSectoresVigentes",
            procedureName = "paC_ListaSectoresVigentes",
            resultClasses = CListaSectoresVigentesEntity.class)
})
public class CListaSectoresVigentesEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("DSCRPCION_SCTOR")
    public String DSCRPCION_SCTOR;

    @JsonProperty("ImagenSector")
    public String ImagenSector;
}
