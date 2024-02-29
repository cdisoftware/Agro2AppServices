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
            name = "admin_ProductoLinksMod",
            procedureName = "admin_ProductoLinksMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class adProductoLinksModEntity {

    @Id
    @JsonProperty("IdLinkProducto")
    public Integer IdLinkProducto;

    @JsonProperty("cd_prdcto")
    public Integer cd_prdcto;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Link")
    public String Link;

    @JsonProperty("TipoLink")
    public Integer TipoLink;
}
