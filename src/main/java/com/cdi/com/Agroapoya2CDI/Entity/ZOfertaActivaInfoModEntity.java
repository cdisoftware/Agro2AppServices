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
            name = "Z_OfertaActivaInfoMod",
            procedureName = "Z_OfertaActivaInfoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class ZOfertaActivaInfoModEntity {

    @Id
    @JsonProperty("IdOferta")
    public Integer IdOferta;

    @JsonProperty("FechaInicio")
    public String FechaInicio;

    @JsonProperty("FechaFin")
    public String FechaFin;

    @JsonProperty("FechaEntrega")
    public String FechaEntrega;

    @JsonProperty("TipoOfeta")
    public Integer TipoOfeta;

    @JsonProperty("MascaraLocali")
    public String MascaraLocali;

    @JsonProperty("TipoDomicilio")
    public Integer TipoDomicilio;

    @JsonProperty("ValorDomicilio")
    public Integer ValorDomicilio;

    @JsonProperty("ValorInicialDomicilio")
    public Integer ValorInicialDomicilio;
}
