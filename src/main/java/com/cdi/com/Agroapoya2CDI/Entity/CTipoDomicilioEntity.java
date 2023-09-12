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
            name = "paC_TipoDomicilio",
            procedureName = "paC_TipoDomicilio",
            resultClasses = CTipoDomicilioEntity.class)
})
public class CTipoDomicilioEntity {

    @Id
    @JsonProperty("IdDomicilio")
    public Integer IdDomicilio;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Estado")
    public Integer Estado;
}
