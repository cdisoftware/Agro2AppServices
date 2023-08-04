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
            name = "Agro_tipoCunpon",
            procedureName = "Agro_tipoCunpon",
            resultClasses = tipoCunponEntity.class)
})
public class tipoCunponEntity {

    @Id
    @JsonProperty("IdCupon")
    public Integer IdCupon;

    @JsonProperty("NombreCupon")
    public String NombreCupon;

    @JsonProperty("Estado")
    public Integer Estado;
}
