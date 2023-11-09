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
            name = "admin_millaSectoresMod",
            procedureName = "admin_millaSectoresMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class admillaSectoresModEntity {

    @Id
    @JsonProperty("IdSectorMilla")
    public Integer IdSectorMilla;

    @JsonProperty("NombreSector")
    public String NombreSector;

    @JsonProperty("cd_rgion")
    public String cd_rgion;

    @JsonProperty("cd_mncpio")
    public String cd_mncpio;
}
