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
            name = "admin_DashProductosLibras",
            procedureName = "admin_DashProductosLibras",
            resultClasses = adDashProductosLibrasEntity.class)
})
public class adDashProductosLibrasEntity {

    @Id
    @JsonProperty("IdMain")
    public Integer IdMain;

    @JsonProperty("IdAno")
    public String IdAno;

    @JsonProperty("IdMes")
    public String IdMes;

    @JsonProperty("IdProducto")
    public Integer IdProducto;

    @JsonProperty("DSCRPCION")
    public String DSCRPCION;

    @JsonProperty("Presentacion")
    public String Presentacion;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("DescripcionSector")
    public String DescripcionSector;

    @JsonProperty("VentasLibras")
    public String VentasLibras;
}
