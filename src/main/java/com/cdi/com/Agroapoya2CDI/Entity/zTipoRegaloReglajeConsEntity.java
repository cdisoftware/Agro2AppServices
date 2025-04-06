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
            name = "z_TipoRegaloReglaje_Cons",
            procedureName = "z_TipoRegaloReglaje_Cons",
            resultClasses = zTipoRegaloReglajeConsEntity.class)
})

public class zTipoRegaloReglajeConsEntity {

    @Id
    @JsonProperty("IdTipo")
    public Integer IdTipo;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;
}
