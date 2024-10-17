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
            name = "z_TipoRegalo_Cons",
            procedureName = "z_TipoRegalo_Cons",
            resultClasses = zTipoRegaloConsEntity.class)
})

public class zTipoRegaloConsEntity {

    @Id
    @JsonProperty("IdTipo")
    public Integer IdTipo;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;

    @JsonProperty("DescEstado")
    public String DescEstado;
}
