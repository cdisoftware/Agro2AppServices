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
            name = "paC_ValorUbersGeneral",
            procedureName = "paC_ValorUbersGeneral",
            resultClasses = CValorUbersGeneralEntity.class)
})
public class CValorUbersGeneralEntity {

    @Id
    @JsonProperty("IdValor")
    public Integer IdValor;

    @JsonProperty("ValorKm")
    public Integer ValorKm;

    @JsonProperty("ValorKilo")
    public Integer ValorKilo;

    @JsonProperty("ValorDescarga")
    public Integer ValorDescarga;
}
