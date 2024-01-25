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
            name = "admin_productosTrans",
            procedureName = "admin_productosTrans",
            resultClasses = adproducTransEntity.class)
})
public class adproducTransEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("TipoProducto")
    public Integer TipoProducto;

    @JsonProperty("IdProducto")
    public Integer IdProducto;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Presentacion")
    public String Presentacion;

    @JsonProperty("Peso")
    public String Peso;

    @JsonProperty("cd_cnctivo")
    public Integer cd_cnctivo;

}
