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
            name = "paCAgro_Preguntas_Encuesta",
            procedureName = "paCAgro_Preguntas_Encuesta",
            resultClasses = CAgroPreguntasEncuestaEntity.class)
})
public class CAgroPreguntasEncuestaEntity {

    @Id
    @JsonProperty("ID_PRGNTA_OFR")
    public Integer ID_PRGNTA_OFR;

    @JsonProperty("CD_TPO_PRGNTA")
    public Integer CD_TPO_PRGNTA;

    @JsonProperty("opciones_seleccion")
    public String opciones_seleccion;

    @JsonProperty("TITULOP")
    public String TITULOP;
}
