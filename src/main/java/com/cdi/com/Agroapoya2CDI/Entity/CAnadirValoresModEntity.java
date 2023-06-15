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
            name = "paC_AnadirValoresMod",
            procedureName = "paC_AnadirValoresMod",
            parameters = {
                @StoredProcedureParameter(name = "Repuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CAnadirValoresModEntity {

    @Id
    @JsonProperty("Cd_cnsctvo")
    public Integer Cd_cnsctvo;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("IdValor")
    public Integer IdValor;

    @JsonProperty("ValorUnd")
    public Integer ValorUnd;

}
