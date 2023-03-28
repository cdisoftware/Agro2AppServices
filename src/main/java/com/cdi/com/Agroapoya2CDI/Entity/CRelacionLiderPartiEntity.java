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
            name = "paC_RelacionLiderParti",
            procedureName = "paC_RelacionLiderParti",
            resultClasses = CRelacionLiderPartiEntity.class)
})
public class CRelacionLiderPartiEntity {

    @Id
    @JsonProperty("IdRelacion")
    public Integer IdRelacion;

    @JsonProperty("IdCarroLider")
    public Integer IdCarroLider;

    @JsonProperty("IdCarroParticipante")
    public Integer IdCarroParticipante;

    @JsonProperty("ValorParti")
    public String ValorParti;

    @JsonProperty("ValorPartiForm")
    public String ValorPartiForm;

    @JsonProperty("NombrePart")
    public String NombrePart;
}
