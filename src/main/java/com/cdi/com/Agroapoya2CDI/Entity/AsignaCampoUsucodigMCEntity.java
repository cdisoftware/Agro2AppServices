package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data

public class AsignaCampoUsucodigMCEntity implements Serializable {

    @Id
    @JsonProperty("subscriber_id")
    public Integer subscriber_id;

    @JsonProperty("field_id")
    public Integer field_id;

    @JsonProperty("field_value")
    public Integer field_value;
}
