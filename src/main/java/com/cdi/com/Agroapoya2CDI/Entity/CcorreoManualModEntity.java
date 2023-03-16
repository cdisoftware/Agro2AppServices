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
            name = "paC_correoManualMod",
            procedureName = "paC_correoManualMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CcorreoManualModEntity {

    @Id
    @JsonProperty("IdEnvio")
    public Integer IdEnvio;

    @JsonProperty("Query")
    public Integer Query;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("Cd_cnctivo")
    public Integer Cd_cnctivo;

    @JsonProperty("IdPlantilla")
    public Integer IdPlantilla;

    @JsonProperty("IdEstado")
    public Integer IdEstado;

    @JsonProperty("IdProgramado")
    public Integer IdProgramado;

    @JsonProperty("FechaEnvio")
    public String FechaEnvio;

    @JsonProperty("HorarioEnvio")
    public Integer HorarioEnvio;
}
