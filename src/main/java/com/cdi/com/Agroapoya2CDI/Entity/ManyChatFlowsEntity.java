package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ManyChatFlowsEntity implements Serializable{

    @Id
    @JsonProperty("subscriber_id")
    public Integer subscriber_id;
    
     @JsonProperty("flow_ns")
    public String flow_ns;
}
