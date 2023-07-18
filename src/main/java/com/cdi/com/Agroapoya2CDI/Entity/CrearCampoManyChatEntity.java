package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CrearCampoManyChatEntity implements Serializable {

    @Id
    @JsonProperty("caption")
    public String caption;

    @JsonProperty("type")
    public String type;

    @JsonProperty("description")
    public String description;
}
