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
            name = "PaC_ConsUserLocalidad",
            procedureName = "PaC_ConsUserLocalidad",
            resultClasses = ConsUserLocalidadEntity.class)
})
public class ConsUserLocalidadEntity {

    @Id
    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("FECHA_CREACION")
    public String FECHA_CREACION;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("DSCRPCION_SCTOR")
    public String DSCRPCION_SCTOR;
}
