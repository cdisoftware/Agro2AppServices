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
            name = "paC_AsignaBodegaMod",
            procedureName = "paC_AsignaBodegaMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CAsignaBodegaModEntity {

    @Id
    @JsonProperty("IdDescarga")
    public Integer IdDescarga;

    @JsonProperty("cd_cnctvo")
    public Integer cd_cnctvo;

    @JsonProperty("IdBodega")
    public Integer IdBodega;

    @JsonProperty("IdTran")
    public Integer IdTran;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("Observacion")
    public String Observacion;

}
