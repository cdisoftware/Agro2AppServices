package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ManyChatCreateUserEntity implements Serializable {

    @Id
    @JsonProperty("first_name")
    public String first_name;

    @JsonProperty("last_name")
    public String last_name;

    @JsonProperty("phone")
    public String phone;

    @JsonProperty("whatsapp_phone")
    public String whatsapp_phone;

    @JsonProperty("email")
    public String email;

    @JsonProperty("gender")
    public String gender;

    @JsonProperty("has_opt_in_sms")
    public Boolean has_opt_in_sms;

    @JsonProperty("has_opt_in_email")
    public Boolean has_opt_in_email;

    @JsonProperty("consent_phrase")
    public String consent_phrase;
}
