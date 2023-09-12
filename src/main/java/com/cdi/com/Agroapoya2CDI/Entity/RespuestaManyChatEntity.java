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
            name = "paC_RespuestaManyChat",
            procedureName = "paC_RespuestaManyChat",
            parameters = {
                @StoredProcedureParameter(name = "RespMicro",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class RespuestaManyChatEntity {

    @Id
    @JsonProperty("Respuesta")
    public String Respuesta;
}
