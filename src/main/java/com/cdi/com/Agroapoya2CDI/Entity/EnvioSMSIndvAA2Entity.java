package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EnvioSMSIndvAA2Entity implements Serializable {

    @Id
    @JsonProperty("Telefono")
    public String Telefono;

    @JsonProperty("Mensaje")
    public String Mensaje;
}
