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
            name = "cliente_Regalo",
            procedureName = "cliente_Regalo",
            resultClasses = clienteRegaloEntity.class)
})
public class clienteRegaloEntity {

    @Id
    @JsonProperty("Unidades")
    public Integer Unidades;

    @JsonProperty("Texto")
    public String Texto;
}
