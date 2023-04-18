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
            name = "paC_GrupoMillaMod",
            procedureName = "paC_GrupoMillaMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CGrupoMillaModEntity {

    @Id
    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

    @JsonProperty("cd_csctvo")
    public Integer cd_csctvo;
    
    @JsonProperty("IdSector")
    public Integer IdSector;

}
