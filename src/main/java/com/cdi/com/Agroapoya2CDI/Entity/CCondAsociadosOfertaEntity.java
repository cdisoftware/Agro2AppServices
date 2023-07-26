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
            name = "paC_ConductorAsociadosOferta",
            procedureName = "paC_ConductorAsociadosOferta",
            resultClasses = CCondAsociadosOfertaEntity.class)
})
public class CCondAsociadosOfertaEntity {

    @Id
    @JsonProperty("CODIGO")
    public Integer CODIGO;

    @JsonProperty("NOMBRE")
    public String NOMBRE;
}
