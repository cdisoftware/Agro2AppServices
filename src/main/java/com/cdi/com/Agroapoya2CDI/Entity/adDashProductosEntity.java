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
            name = "admin_DashProductos",
            procedureName = "admin_DashProductos",
            resultClasses = adDashProductosEntity.class)
})
public class adDashProductosEntity {

    @Id
    @JsonProperty("Id")
    public String Id;

    @JsonProperty("IdAno")
    public Integer IdAno;

    @JsonProperty("IdMes")
    public Integer IdMes;

    @JsonProperty("idproducto")
    public Integer idproducto;

    @JsonProperty("DSCRPCION")
    public String DSCRPCION;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("DescripcionSector")
    public String DescripcionSector;

    @JsonProperty("Cantidad")
    public Integer Cantidad;
}
