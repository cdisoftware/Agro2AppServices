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
            name = "pa_CTextosOfertaConsulta",
            procedureName = "pa_CTextosOfertaConsulta",
            resultClasses = pa_CTextosOfertaConsultaEntity.class)
})
public class pa_CTextosOfertaConsultaEntity {

    @Id
    @JsonProperty("idCorreo")
    public Integer idCorreo;

    @JsonProperty("ImgCorreo")
    public String ImgCorreo;

    @JsonProperty("TextoCorreo")
    public String TextoCorreo;

    @JsonProperty("TextoWhat")
    public String TextoWhat;

    @JsonProperty("cd_cnctivo")
    public Integer cd_cnctivo;

    @JsonProperty("idSector")
    public Integer idSector;

    @JsonProperty("Plantilla")
    public String Plantilla;

    @JsonProperty("TextoSms")
    public String TextoSms;

    @JsonProperty("EnvioCorreo")
    public Integer EnvioCorreo;

    @JsonProperty("EnvioSms")
    public Integer EnvioSms;

}
