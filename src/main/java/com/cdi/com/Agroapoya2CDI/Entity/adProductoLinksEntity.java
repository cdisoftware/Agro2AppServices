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
            name = "admin_ProductoLinks",
            procedureName = "admin_ProductoLinks",
            resultClasses = adProductoLinksEntity.class)
})
public class adProductoLinksEntity {

    @Id
    @JsonProperty("IdLinkProducto")
    public Integer IdLinkProducto;

    @JsonProperty("cd_prdcto")
    public Integer cd_prdcto;

    @JsonProperty("Link")
    public String Link;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("TipoLink")
    public Integer TipoLink;
}
