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
            name = "z_OfertaActivaInfomarcionAdicional_cons",
            procedureName = "z_OfertaActivaInfomarcionAdicional_cons",
            resultClasses = zOfertaActivaInfomarcionAdicionalconsEntity.class)
})

public class zOfertaActivaInfomarcionAdicionalconsEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("IdOfertaActivaInformacion")
    public Integer IdOfertaActivaInformacion;

    @JsonProperty("TipoReglaRegalo")
    public Integer TipoReglaRegalo;

    @JsonProperty("DescReglaje")
    public String DescReglaje;

    @JsonProperty("TipoRegaloParti")
    public Integer TipoRegaloParti;

    @JsonProperty("DescRegaloParti")
    public String DescRegaloParti;

    @JsonProperty("IdRegaloParticipante")
    public Integer IdRegaloParticipante;

    @JsonProperty("NombreRegaloParti")
    public String NombreRegaloParti;

    @JsonProperty("IdTipoCuponParticipante")
    public Integer IdTipoCuponParticipante;

    @JsonProperty("ValorCuponParticipante")
    public Integer ValorCuponParticipante;

    @JsonProperty("TipoRegaloLider")
    public Integer TipoRegaloLider;

    @JsonProperty("DescRegaloLider")
    public String DescRegaloLider;

    @JsonProperty("MaximoRegaloLider")
    public Integer MaximoRegaloLider;

    @JsonProperty("RegistrosParaRegaloLider")
    public Integer RegistrosParaRegaloLider;

    @JsonProperty("IdRegaloLider")
    public Integer IdRegaloLider;

    @JsonProperty("NombreRegaloLider")
    public String NombreRegaloLider;

    @JsonProperty("IdTipoCuponLider")
    public Integer IdTipoCuponLider;

    @JsonProperty("MaximoValorCuponLider")
    public Integer MaximoValorCuponLider;

    @JsonProperty("NumRegistrosCuponLider")
    public Integer NumRegistrosCuponLider;

    @JsonProperty("ValorCuponLider")
    public Integer ValorCuponLider;

//    @JsonProperty("MaximoValorCuponParticipante")
//    public Integer MaximoValorCuponParticipante;
//    @JsonProperty("NumRegistrosCuponParticipante")
//    public Integer NumRegistrosCuponParticipante;
}
