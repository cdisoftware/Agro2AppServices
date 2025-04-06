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
            name = "z_TipoEstado_const",
            procedureName = "z_TipoEstado_const",
            resultClasses = zTipoEstadoconstEntity.class)
})

public class zTipoEstadoconstEntity {

    @Id
    @JsonProperty("IdTipo")
    public Integer IdTipo;

    @JsonProperty("Descripcion")
    public String Descripcion;
}
