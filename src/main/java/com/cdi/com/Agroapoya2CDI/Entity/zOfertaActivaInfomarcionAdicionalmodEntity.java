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
            name = "z_OfertaActivaInfomarcionAdicional_mod",
            procedureName = "z_OfertaActivaInfomarcionAdicional_mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zOfertaActivaInfomarcionAdicionalmodEntity {

    @Id
    @JsonProperty("IdOferta")
    public Integer IdOferta;

    @JsonProperty("TipoRegaloRegla")
    public Integer TipoRegaloRegla;

    @JsonProperty("TipoRegaloParti")
    public Integer TipoRegaloParti;

    @JsonProperty("TipoRegaloLider")
    public Integer TipoRegaloLider;

    @JsonProperty("MaximoRegaloLider")
    public Integer MaximoRegaloLider;

    @JsonProperty("RegistroRegaloLider")
    public Integer RegistroRegaloLider;

    @JsonProperty("IdRegaloLider")
    public Integer IdRegaloLider;

    @JsonProperty("IdRegaloParti")
    public Integer IdRegaloParti;

//    @JsonProperty("IdTipoCuponLider")
//    public Integer IdTipoCuponLider;

    @JsonProperty("MaximoValorCuponLider")
    public Integer MaximoValorCuponLider;

    @JsonProperty("NumRegistrosCuponLider")
    public Integer NumRegistrosCuponLider;

    @JsonProperty("ValorCuponLider")
    public Integer ValorCuponLider;

//    @JsonProperty("IdTipoCuponParticipante")
//    public Integer IdTipoCuponParticipante;

//    @JsonProperty("MaximoValorCuponParticipante")
//    public Integer MaximoValorCuponParticipante;

//    @JsonProperty("NumRegistrosCuponParticipante")
//    public Integer NumRegistrosCuponParticipante;

    @JsonProperty("ValorCuponParticipante")
    public Integer ValorCuponParticipante;
}
