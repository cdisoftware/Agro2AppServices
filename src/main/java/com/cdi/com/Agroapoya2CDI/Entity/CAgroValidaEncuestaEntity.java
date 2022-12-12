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
            name = "paCAgro_valida_encuesta",
            procedureName = "paCAgro_valida_encuesta",
            resultClasses = CAgroValidaEncuestaEntity.class)
})
public class CAgroValidaEncuestaEntity {

    @Id
    @JsonProperty("respuestas")
    public String respuestas;

}
