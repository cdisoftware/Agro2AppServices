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
            name = "paC_DtlleDescargasMod",
            procedureName = "paC_DtlleDescargasMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CDtlleDescargasModEntity {

    @Id
    @JsonProperty("cd_cnctvo")
    public Integer cd_cnctvo;

    @JsonProperty("CantidadMax")
    public Integer CantidadMax;

    @JsonProperty("KilosMax")
    public Integer KilosMax;

    @JsonProperty("DistanciaMax")
    public Integer DistanciaMax;

    @JsonProperty("IdSector")
    public Integer IdSector;

}
