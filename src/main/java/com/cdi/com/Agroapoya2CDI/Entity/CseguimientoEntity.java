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
            name = "paC_seguimiento",
            procedureName = "paC_seguimiento",
            resultClasses = CseguimientoEntity.class)
})
public class CseguimientoEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("nombre")
    public String nombre;

    @JsonProperty("icono")
    public String icono;

    @JsonProperty("color")
    public String color;
}
