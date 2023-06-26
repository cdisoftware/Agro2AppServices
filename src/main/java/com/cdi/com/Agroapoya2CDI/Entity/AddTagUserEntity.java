package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AddTagUserEntity implements Serializable {

    @Id
    @JsonProperty("subscriber_id")
    public Integer subscriber_id;

    @JsonProperty("tag_id")
    public Integer tag_id;
}
