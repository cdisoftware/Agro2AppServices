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
            name = "paCAgro_Pregunta_Oferta",
            procedureName = "paCAgro_Pregunta_Oferta",
            resultClasses = CAgroPreguntaOfertaEntity.class)
})
public class CAgroPreguntaOfertaEntity {

    @Id
    @JsonProperty("ID_PRGNTA_OFR")
    public Integer ID_PRGNTA_OFR;

    @JsonProperty("CD_CNSCTVO")
    public String CD_CNSCTVO;

    @JsonProperty("ID_SCTOR_OFRTA")
    public Integer ID_SCTOR_OFRTA;

    @JsonProperty("CD_TPO_PRGNTA")
    public Integer CD_TPO_PRGNTA;

    @JsonProperty("NOM_TPO_PRGNTA")
    public String NOM_TPO_PRGNTA;

    @JsonProperty("TITULO_PREGUNTA_OFR")
    public String TITULO_PREGUNTA_OFR;

    @JsonProperty("opciones_seleccion")
    public String opciones_seleccion;
}
