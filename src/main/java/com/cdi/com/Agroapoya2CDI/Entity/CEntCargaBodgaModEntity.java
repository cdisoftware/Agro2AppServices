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
            name = "paC_EntregaCargaBodegaMod",
            procedureName = "paC_EntregaCargaBodegaMod",
            parameters = {
                @StoredProcedureParameter(name = "Repuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CEntCargaBodgaModEntity {

    @Id
    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Cd_cnctivo")
    public Integer Cd_cnctivo;

    @JsonProperty("Id_Sector")
    public Integer Id_Sector;

    @JsonProperty("Observacion")
    public String Observacion;

}
