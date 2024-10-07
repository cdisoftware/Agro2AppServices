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
            name = "z_RelacionLocalidadZona_Cons",
            procedureName = "z_RelacionLocalidadZona_Cons",
            resultClasses = zRelacionLocalidadZonaConsEntity.class)
})

public class zRelacionLocalidadZonaConsEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("TipoLocalidad")
    public Integer TipoLocalidad;

    @JsonProperty("IdTipoZona")
    public Integer IdTipoZona;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("tipoEstado")
    public Integer tipoEstado;

    @JsonProperty("DescripEstasdo")
    public String DescripEstasdo;
}
