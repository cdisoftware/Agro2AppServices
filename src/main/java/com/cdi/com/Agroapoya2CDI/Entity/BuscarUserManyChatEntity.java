package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BuscarUserManyChatEntity implements Serializable {

    @Id
    @JsonProperty("email")
    public String email;

    @JsonProperty("phone")
    public String phone;
}
