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
            name = "paC_pagosLider",
            procedureName = "paC_pagosLider",
            resultClasses = CpagosLiderEntity.class)
})
public class CpagosLiderEntity {

    @Id
    @JsonProperty("ID_CARRO")
    public Integer ID_CARRO;

    @JsonProperty("PagoXParti")
    public Integer PagoXParti;

    @JsonProperty("PagoXPartiForm")
    public String PagoXPartiForm;

    @JsonProperty("ValorPagarPrin")
    public String ValorPagarPrin;

    @JsonProperty("ValorPagarPrinForm")
    public String ValorPagarPrinForm;

    @JsonProperty("ValorPagar")
    public String ValorPagar;

    @JsonProperty("ValorPagarForm")
    public String ValorPagarForm;
}
