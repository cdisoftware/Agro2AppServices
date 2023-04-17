package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ImagesApiEntity implements Serializable {

    @Id
    @JsonProperty("nombre_imagen")
    public String nombre_imagen;

    @JsonProperty("NoImagenes")
    public Integer NoImagenes;

    @JsonProperty("paginas")
    public Integer paginas;
}
