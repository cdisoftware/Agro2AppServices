package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "z_tipoproducto_mod",
            procedureName = "z_tipoproducto_mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class ztipoproductomodEntity {

    @Id
    @JsonProperty("IdTipo")
    public Integer IdTipo;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("DescripcionLarga")
    public String DescripcionLarga;

    @JsonProperty("DescripcionCorta")
    public String DescripcionCorta;

    @JsonProperty("Prefijo")
    public String Prefijo;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;

    @JsonProperty("TipoVentaProducto")
    public Integer TipoVentaProducto;

    @JsonProperty("UsucodigProd")
    public Integer UsucodigProd;
}
