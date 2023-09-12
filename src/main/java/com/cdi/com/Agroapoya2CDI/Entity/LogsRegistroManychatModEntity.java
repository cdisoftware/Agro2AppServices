package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paC_LogsRegistroManychatMod",
            procedureName = "paC_LogsRegistroManychatMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class LogsRegistroManychatModEntity {

    @Id
    @JsonProperty("usucodig")
    public Integer usucodig;

    @JsonProperty("celular")
    public String celular;

    @JsonProperty("rta_manychat")
    public String rta_manychat;

    @JsonProperty("origen")
    public Integer origen;

}
