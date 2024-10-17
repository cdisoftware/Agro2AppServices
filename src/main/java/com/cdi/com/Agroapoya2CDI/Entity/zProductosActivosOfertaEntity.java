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
            name = "z_ProductosActivosOferta",
            procedureName = "z_ProductosActivosOferta",
            resultClasses = zProductosActivosOfertaEntity.class)
})

public class zProductosActivosOfertaEntity {

    @Id
    @JsonProperty("IdOferta")
    public Integer IdOferta;

    @JsonProperty("NombreProducto")
    public String NombreProducto;

    @JsonProperty("DescripcionCorta")
    public String DescripcionCorta;

    @JsonProperty("DescripcionLarga")
    public String DescripcionLarga;

    @JsonProperty("Prefijo")
    public String Prefijo;

    @JsonProperty("TipoVentaProducto")
    public Integer TipoVentaProducto;

    @JsonProperty("DescrTipoVentaProducto")
    public String DescrTipoVentaProducto;

    @JsonProperty("IdEstado")
    public Integer IdEstado;

    @JsonProperty("DescEstado")
    public String DescEstado;

    @JsonProperty("UsucodigProductor")
    public Integer UsucodigProductor;

    @JsonProperty("NombreProductor")
    public String NombreProductor;
}
