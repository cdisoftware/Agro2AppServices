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
            name = "admin_listadoProducto",
            procedureName = "admin_listadoProducto",
            resultClasses = adlistadoProductoEntity.class)
})
public class adlistadoProductoEntity {

    @Id
    @JsonProperty("Id")
    public String Id;

    @JsonProperty("IdProducto")
    public Integer IdProducto;

    @JsonProperty("ancla")
    public Integer ancla;

    @JsonProperty("NombreProducto")
    public String NombreProducto;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("Orden")
    public String Orden;
}
