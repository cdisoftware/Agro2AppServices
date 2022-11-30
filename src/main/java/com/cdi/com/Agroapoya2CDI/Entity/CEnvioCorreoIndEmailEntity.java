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
            name = "paC_EnvioCorreo_IndEmail",
            procedureName = "paC_EnvioCorreo_IndEmail",
            resultClasses = CEnvioCorreoIndEmailEntity.class)

})
public class CEnvioCorreoIndEmailEntity {

    @Id
    @JsonProperty("Email")
    public String Email;

    @JsonProperty("IdPlantilla")
    public Integer IdPlantilla;

    @JsonProperty("Cd_cnctvo")
    public Integer Cd_cnctvo;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("TextUno")
    public String TextUno;

    @JsonProperty("TextDos")
    public String TextDos;

    @JsonProperty("TextTres")
    public String TextTres;

    @JsonProperty("Asunto")
    public String Asunto;
    
    @JsonProperty("Html")
    public String Html;

    @JsonProperty("ImagenEnc")
    public String ImagenEnc;

    @JsonProperty("ImagenPie")
    public String ImagenPie;

    @JsonProperty("EmailOpc")
    public String EmailOpc;
    
}
