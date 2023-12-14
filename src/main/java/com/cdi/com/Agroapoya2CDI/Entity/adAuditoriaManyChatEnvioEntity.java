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
            name = "admin_AuditoriaManyChatEnvio",
            procedureName = "admin_AuditoriaManyChatEnvio",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class adAuditoriaManyChatEnvioEntity {

    @Id
    @JsonProperty("IdManyChat")
    public String IdManyChat;

    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("IdAuditoria")
    public Integer IdAuditoria;

    @JsonProperty("IdTipoEnvio")
    public Integer IdTipoEnvio;

}
