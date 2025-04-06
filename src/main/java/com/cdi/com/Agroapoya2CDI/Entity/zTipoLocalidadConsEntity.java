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
            name = "z_TipoLocalidad_Cons",
            procedureName = "z_TipoLocalidad_Cons",
            resultClasses = zTipoLocalidadConsEntity.class)
})

public class zTipoLocalidadConsEntity {

    @Id
    @JsonProperty("IdTipo")
    public Integer IdTipo;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("tipoEstado")
    public Integer tipoEstado;

    @JsonProperty("DescripEstasdo")
    public String DescripEstasdo;

    @JsonProperty("CantidadUsu")
    public String CantidadUsu;
}
