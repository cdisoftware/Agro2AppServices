package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paC_ValidaCodGrupo",
            procedureName = "paC_ValidaCodGrupo",
            resultClasses = CValidaCodGrupoEntity.class)
})
public class CValidaCodGrupoEntity {

    @Id
    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("Cd_cnsctvo")
    public Integer Cd_cnsctvo;

    @JsonProperty("Vigencia")
    public Integer Vigencia;
}
