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
            name = "paC_tableroMod",
            procedureName = "paC_tableroMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CtableroModEntity {

    @Id
    @JsonProperty("UsucodigTrans")
    public Integer UsucodigTrans;

    @JsonProperty("IdConductor")
    public Integer IdConductor;

    @JsonProperty("IdPlataforma")
    public Integer IdPlataforma;
}
