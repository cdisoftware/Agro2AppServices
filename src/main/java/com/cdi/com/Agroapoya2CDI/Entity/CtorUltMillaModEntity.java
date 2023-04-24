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
            name = "paC_ConductorUltimaMuillaMod",
            procedureName = "paC_ConductorUltimaMuillaMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CtorUltMillaModEntity {

    @Id
    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

    @JsonProperty("cd_cnsctivo")
    public Integer cd_cnsctivo;

    @JsonProperty("idSector")
    public Integer idSector;

    @JsonProperty("idConductor")
    public Integer idConductor;
}
