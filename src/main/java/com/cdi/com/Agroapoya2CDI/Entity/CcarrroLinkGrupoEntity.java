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
            name = "paC_carrroLinkGrupo",
            procedureName = "paC_carrroLinkGrupo",
            parameters = {
                @StoredProcedureParameter(name = "repuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CcarrroLinkGrupoEntity {

    @Id
    @JsonProperty("IdHexaGrupo")
    public String IdHexaGrupo;

    @JsonProperty("ID_CARRO")
    public String ID_CARRO;
}
