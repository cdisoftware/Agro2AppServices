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
            name = "z_TipoZona_Cons",
            procedureName = "z_TipoZona_Cons",
            resultClasses = zTipoZonaConsEntity.class)
})

public class zTipoZonaConsEntity {

    @Id
    @JsonProperty("IdTipo")
    public Integer IdTipo;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("tipoEstado")
    public Integer tipoEstado;

    @JsonProperty("DescripEstasdo")
    public String DescripEstasdo;
}
