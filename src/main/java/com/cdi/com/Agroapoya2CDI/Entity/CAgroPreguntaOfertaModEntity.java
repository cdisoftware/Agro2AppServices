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
            name = "paCAgro_Pregunta_Oferta_Mod",
            procedureName = "paCAgro_Pregunta_Oferta_Mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CAgroPreguntaOfertaModEntity {

    @Id
    @JsonProperty("ID_PRGNTA_OFR")
    public String ID_PRGNTA_OFR;

    @JsonProperty("CD_CNSCTVO")
    public String CD_CNSCTVO;

    @JsonProperty("ID_SCTOR_OFRTA")
    public String ID_SCTOR_OFRTA;

    @JsonProperty("CD_TPO_PRGNTA")
    public String CD_TPO_PRGNTA;

    @JsonProperty("TTLO_PRGNTA")
    public String TTLO_PRGNTA;

    @JsonProperty("OPCIONES_PRGNTA")
    public String OPCIONES_PRGNTA;

}
