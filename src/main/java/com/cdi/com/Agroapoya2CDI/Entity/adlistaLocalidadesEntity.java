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
            name = "admin_listaLocalidades",
            procedureName = "admin_listaLocalidades",
            resultClasses = adlistaLocalidadesEntity.class)
})
public class adlistaLocalidadesEntity {

    @Id
    @JsonProperty("sctor_ofrta")
    public Integer sctor_ofrta;

    @JsonProperty("dscrpcion_sctor")
    public String dscrpcion_sctor;
}
