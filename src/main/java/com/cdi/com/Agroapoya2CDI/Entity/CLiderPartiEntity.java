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
            name = "paC_LiderParti",
            procedureName = "paC_LiderParti",
            resultClasses = CLiderPartiEntity.class)
})
public class CLiderPartiEntity {

    @Id
    @JsonProperty("TextoWhat")
    public String TextoWhat;
}
