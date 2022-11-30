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
            name = "paC_SubSeguimiento",
            procedureName = "paC_SubSeguimiento",
            resultClasses = CSubSeguimientoEntity.class)
})
public class CSubSeguimientoEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Fecha")
    public String Fecha;

    @JsonProperty("icono")
    public String icono;

    @JsonProperty("color")
    public String color;
}
