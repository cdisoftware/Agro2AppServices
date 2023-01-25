package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CorreosMasivosPandaEntity implements Serializable {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdPlantilla")
    public Integer IdPlantilla;

    @JsonProperty("Asunto")
    public String Asunto;

    @JsonProperty("usucodig")
    public Integer usucodig;

    @JsonProperty("Email")
    public String Email;

    @JsonProperty("Html")
    public String Html;

    @JsonProperty("ImagenEnc")
    public String ImagenEnc;

    @JsonProperty("ImagenPie")
    public String ImagenPie;

    @JsonProperty("IdCodigoProceso")
    public Integer IdCodigoProceso;
}
