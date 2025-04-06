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
            name = "z_TipoProducto_cons",
            procedureName = "z_TipoProducto_cons",
            resultClasses = zTipoProductoconsEntity.class)
})

public class zTipoProductoconsEntity {

    @Id
    @JsonProperty("idtipo")
    public Integer idtipo;

    @JsonProperty("nombre")
    public String nombre;

    @JsonProperty("DescripcionLarga")
    public String DescripcionLarga;

    @JsonProperty("DescripcionCorta")
    public String DescripcionCorta;

    @JsonProperty("Prefijo")
    public String Prefijo;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;

    @JsonProperty("DescEstado")
    public String DescEstado;

    @JsonProperty("TipoVentaProducto")
    public Integer TipoVentaProducto;

    @JsonProperty("DescVentaProd")
    public String DescVentaProd;
}
