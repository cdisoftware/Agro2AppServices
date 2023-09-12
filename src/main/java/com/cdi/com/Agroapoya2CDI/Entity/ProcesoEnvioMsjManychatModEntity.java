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
            name = "paC_LogsEnvioMsjManychatMod",
            procedureName = "paC_LogsEnvioMsjManychatMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class ProcesoEnvioMsjManychatModEntity {

    @Id
    @JsonProperty("id_proceso")
    public Integer id_proceso;

    @JsonProperty("sql_proceso")
    public String sql_proceso;

    @JsonProperty("usucodig")
    public Integer usucodig;

    @JsonProperty("usucodig_msj")
    public Integer usucodig_msj;

    @JsonProperty("celular")
    public String celular;

    @JsonProperty("id_manychat")
    public String id_manychat;

    @JsonProperty("mensaje")
    public String mensaje;

}
