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
            name = "paCAgro_Respuesta_Encuesta_Compra",
            procedureName = "paCAgro_Respuesta_Encuesta_Compra",
            resultClasses = CAgroRespEncCompEntity.class)
})
public class CAgroRespEncCompEntity {

    @Id
    @JsonProperty("ID_PRGNTA_OFR")
    public Integer ID_PRGNTA_OFR;

    @JsonProperty("CD_TPO_PRGNTA")
    public Integer CD_TPO_PRGNTA;

    @JsonProperty("TITULOP")
    public String TITULOP;

    @JsonProperty("opciones_seleccion")
    public String opciones_seleccion;

    @JsonProperty("RESPUESTA")
    public String RESPUESTA;

    @JsonProperty("opciones_RTA")
    public String opciones_RTA;
}
