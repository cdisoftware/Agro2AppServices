package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCAgro_Respuestas_Encuesta_Mod",
            procedureName = "paCAgro_Respuestas_Encuesta_Mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CAgroRespuestasEncuestaModEntity {

    @Id
    @JsonProperty("ID_CLNTE")
    public String ID_CLNTE;

    @JsonProperty("ID_PRGNTA_OFR")
    public String ID_PRGNTA_OFR;

    @JsonProperty("CD_TPO_PRGNTA")
    public String CD_TPO_PRGNTA;

    @JsonProperty("RESPUESTA_PRG")
    public String RESPUESTA_PRG;
}
