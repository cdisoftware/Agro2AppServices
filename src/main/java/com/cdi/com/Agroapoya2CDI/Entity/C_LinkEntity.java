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
            name = "paC_Link",
            procedureName = "paC_Link",
            resultClasses = C_LinkEntity.class)
})
public class C_LinkEntity {

    @Id
    @JsonProperty("Link")
    public String Link;
}
