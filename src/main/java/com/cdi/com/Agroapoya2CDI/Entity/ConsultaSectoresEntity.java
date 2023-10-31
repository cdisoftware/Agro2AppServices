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
            name = "admin_ListaSectores",
            procedureName = "admin_ListaSectores",
            resultClasses = ConsultaSectoresEntity.class)
})
public class ConsultaSectoresEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("SCTOR_OFRTA")
    public Integer SCTOR_OFRTA;

    @JsonProperty("DSCRPCION_SCTOR")
    public String DSCRPCION_SCTOR;
}
